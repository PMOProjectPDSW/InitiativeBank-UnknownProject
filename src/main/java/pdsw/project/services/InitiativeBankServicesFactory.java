package pdsw.project.services;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import java.util.Optional;
import org.mybatis.guice.XMLMyBatisModule;
import pdsw.project.persistence.dao.CommentDAO;
import pdsw.project.persistence.dao.InitiativeDAO;
import pdsw.project.persistence.dao.RoleDAO;
import pdsw.project.persistence.dao.UserDAO;
import pdsw.project.persistence.dao.VoteDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisCommentDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisInitiativeDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisRoleDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisUserDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisVoteDAO;
import pdsw.project.services.impl.InitiativeBankServicesImpl;

/**
 * Class User that defines all the attributes that an User can have
 *
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class InitiativeBankServicesFactory {

    private static InitiativeBankServicesFactory instance = new InitiativeBankServicesFactory();
    private static Optional<Injector> optInjector;

    private Injector myBatisInjector(String env, String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                //TO-TO
                bind(InitiativeBankServices.class).to(InitiativeBankServicesImpl.class);
                bind(UserDAO.class).to(MyBatisUserDAO.class);                
                bind(InitiativeDAO.class).to(MyBatisInitiativeDAO.class);
                bind(CommentDAO.class).to(MyBatisCommentDAO.class);
                bind(VoteDAO.class).to(MyBatisVoteDAO.class);
                bind(RoleDAO.class).to(MyBatisRoleDAO.class);
            }
        });
    }

    private InitiativeBankServicesFactory() {
        optInjector = Optional.empty();
    }

    public InitiativeBankServices getInitiativeServices() {
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development", "mybatis-config.xml"));
        }
        return optInjector.get().getInstance(InitiativeBankServices.class);
    }

    public static InitiativeBankServicesFactory getInstance() {
        return instance;
    }

}
