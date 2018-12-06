package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Initiative;
import pdsw.project.persistence.dao.InitiativeDAO;
import pdsw.project.persistence.dao.mybatis.mappers.InitiativeMapper;

/**
 * Class MyBatisInitiativeDAO that implements all the functionalities related
 * with a Initiative
 *
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisInitiativeDAO implements InitiativeDAO {

    @Inject
    private InitiativeMapper initiativeMapper;

    @Override
    public Initiative load(long id) throws PersistenceException {
        try {
            return initiativeMapper.getInitiative(id);
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudieron mostrar todas las Iniciativas.", ex);
        }
    }

    @Override
    public List<Initiative> loadAll() {

        return initiativeMapper.getInitiatives();

    }
    
    @Override
    public List<Initiative> loadAllProponent(long user_id) {
        return initiativeMapper.getInitiativesProponent(user_id);
    }

    @Override
    public void addInitiative(String title, String description, String newStatus, Date creationDate, String field, String keyWords, long user_id, long tag_id) {
        initiativeMapper.addInitiative(title, description, newStatus, creationDate, field, keyWords, user_id, tag_id);
    }
    
    @Override
    public void updateStatus(long id, String newStatus) {
        initiativeMapper.updateStatus(id, newStatus);
    }
    
    

    /*
    @Override
    public void save (Intention inten) throws PersistenceException{
    	System.out.println(inten);
    	intentionMapper.addIntention(inten);        
    }
     */

    

    
}
