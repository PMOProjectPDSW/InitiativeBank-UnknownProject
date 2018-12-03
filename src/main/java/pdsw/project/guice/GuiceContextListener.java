package pdsw.project.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import pdsw.project.persistence.dao.CommentDAO;

import pdsw.project.persistence.dao.InitiativeDAO;
import pdsw.project.persistence.dao.UserDAO;
import pdsw.project.persistence.dao.VoteDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisCommentDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisInitiativeDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisUserDAO;
import pdsw.project.persistence.dao.mybatis.MyBatisVoteDAO;
import pdsw.project.services.InitiativeBankServices;
import pdsw.project.services.impl.InitiativeBankServicesImpl;

/**
 *
 * @author 2099190
 */
public class GuiceContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");
                // TO-DO: Add Daos
                bind(InitiativeBankServices.class).to(InitiativeBankServicesImpl.class);
                bind(UserDAO.class).to(MyBatisUserDAO.class);
                bind(InitiativeDAO.class).to(MyBatisInitiativeDAO.class);
                bind(CommentDAO.class).to(MyBatisCommentDAO.class);
                bind(VoteDAO.class).to(MyBatisVoteDAO.class);
            }
        });
        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}