package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;
import pdsw.project.entities.Role;

/**
 * Interface RoleMapper that connects the 
 * functionalities with the DataBase of the Role
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface RoleMapper {
    
    public Role getRole(@Param("role_id") Long id);
    public ArrayList<Role> getRoles();
    
}