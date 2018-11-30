package pdsw.project.persistence.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import java.util.List;

import pdsw.project.entities.Initiative;

/**
 * Interface InitiativeDAO that defines all the
 * functionalities related with a Initiative
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface InitiativeDAO {
    
    public Initiative load(long id) throws PersistenceException;
    public List<Initiative> loadAll() throws PersistenceException;
    
    //implement
    //public void save(Initiative initia) throws PersistenceException;
    
}
