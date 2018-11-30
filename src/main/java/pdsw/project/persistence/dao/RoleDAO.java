package pdsw.project.persistence.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import java.util.List;

import pdsw.project.entities.Role;

/**
 * Interface RoleDAO that defines all the
 * functionalities related with a Role
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface RoleDAO {
    
    public Role load(long id) throws PersistenceException;
    public List<Role> loadAll() throws PersistenceException;
    
    //implement
    //public void save(Initiative initia) throws PersistenceException;
    
}
