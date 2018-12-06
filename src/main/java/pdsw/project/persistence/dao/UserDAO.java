package pdsw.project.persistence.dao;

import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;

import pdsw.project.entities.User;

/**
 * Interface UserDAO that defines all the
 * functionalities related with a User
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface UserDAO {
    
    public User load(String email) throws PersistenceException;
    public List<User> loadAll() throws PersistenceException;
    public void updateRole(long id, String newRole) throws PersistenceException;;
     
     
    
    
    
    public void save(User user) throws PersistenceException;
    //Change mail to ID
    public User load(long id) throws PersistenceException;
    
    public void update(User user) throws PersistenceException;

   
    
}
