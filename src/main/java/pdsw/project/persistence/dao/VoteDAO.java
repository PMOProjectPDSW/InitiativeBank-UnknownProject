package pdsw.project.persistence.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import java.util.List;

import pdsw.project.entities.Vote;

/**
 * Interface VoteDAO that defines all the
 * functionalities related with a Vote
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface VoteDAO {
    
    public Vote load(long id) throws PersistenceException;
    public List<Vote> loadAll() throws PersistenceException;
    
    //implement
    //public void save(Initiative initia) throws PersistenceException;
    
}
