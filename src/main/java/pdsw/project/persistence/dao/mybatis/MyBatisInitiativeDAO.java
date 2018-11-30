package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Initiative;
import pdsw.project.persistence.dao.InitiativeDAO;
import pdsw.project.persistence.dao.mybatis.mappers.InitiativeMapper;

/**
 * Class MyBatisInitiativeDAO that implements all the
 * functionalities related with a Initiative
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisInitiativeDAO implements InitiativeDAO{
    
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
    public List<Initiative> loadAll() throws PersistenceException {
        try {
            return initiativeMapper.getInitiatives();
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudieron mostrar todas las Iniciativas.", ex);
        }              
    }
    
    /*
    @Override
    public void save (Intention inten) throws PersistenceException{
    	System.out.println(inten);
    	intentionMapper.addIntention(inten);        
    }
    */
 
}