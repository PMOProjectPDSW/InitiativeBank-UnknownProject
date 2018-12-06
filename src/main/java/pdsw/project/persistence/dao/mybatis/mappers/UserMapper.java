package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pdsw.project.entities.User;

/**
 * Interface UserMapper that connects the 
 * functionalities with the DataBase of the User
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface UserMapper {
    
    public User getUserByEmail(@Param("user_email") String email);
    public List<User> getUsers();
    public void updateRole(@Param("user_id") long id, @Param("user_role") String newRole);
    
    
    
    
    
    public User getUserByID(@Param("user_id") long id);
    

    
    
}
