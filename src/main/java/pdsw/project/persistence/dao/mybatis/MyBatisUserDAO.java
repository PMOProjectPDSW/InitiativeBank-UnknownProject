package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.User;
import pdsw.project.persistence.dao.UserDAO;
import pdsw.project.persistence.dao.mybatis.mappers.UserMapper;

/**
 * Class MyBatisUserDAO that implements all the functionalities related with a
 * User
 *
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisUserDAO implements UserDAO {

    @Inject
    private UserMapper userMapper;

    @Override
    public User load(String email) throws PersistenceException {
        try {
            return userMapper.getUserByEmail(email);
        } catch (Exception ex) {
            throw new PersistenceException("\nERROR:\nClass: MyBatisUserDAO\n-Method: load()\nNo existe ningun usuario con el correo: \n" + email + "\n", ex);
        }
    }

    @Override
    public List<User> loadAll() throws PersistenceException {
        try {
            return userMapper.getUsers();
        } catch (Exception ex) {
            throw new PersistenceException("\nERROR MyBATIS:\nNo se pudieron cargar todos los usuarios: \n", ex);
        }
    }

    @Override
    public void updateRole(long id, String newRole) throws PersistenceException {
        try {
            userMapper.updateRole(id, newRole);
        } catch (Exception ex) {
            throw new PersistenceException("\nERROR MyBATIS:\nNo se pudieron cargar todos los usuarios: \n", ex);
        }
    }

    @Override
    public void save(User user) throws PersistenceException {
        //userMapper.addUser
        throw new UnsupportedOperationException("Not supported yet.");
        //To DO
    }

    @Override
    public User load(long id) throws PersistenceException {
        try {
            return userMapper.getUserByID(id);
        } catch (Exception ex) {
            throw new PersistenceException("\nERROR MyBATIS:\nNo existe ningun usuario con el documento: \n" + id + "\n", ex);
        }
    }

    @Override
    public void update(User user) throws PersistenceException {
        //userMapper.addUser
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
