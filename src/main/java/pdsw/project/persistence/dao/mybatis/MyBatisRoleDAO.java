package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Role;
import pdsw.project.persistence.dao.RoleDAO;
import pdsw.project.persistence.dao.mybatis.mappers.RoleMapper;

/**
 * Class MyBatisRoleDAO that implements all the
 * functionalities related with a Role
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisRoleDAO implements RoleDAO{
    
    @Inject
    private RoleMapper roleMapper;
    
    @Override
    public Role load(long id) throws PersistenceException {
        try {
            return roleMapper.getRole(id);
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudo mostrar el Rol.", ex);
        }  
    }
    
    @Override
    public List<Role> loadAll() throws PersistenceException {
        try {
            return roleMapper.getRoles();
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudieron mostrar todas los Roles.", ex);
        }              
    }    
    
}