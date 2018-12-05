package pdsw.project.beans;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankException;
import pdsw.project.services.InitiativeBankServices;

/**
 *
 * @author 2099190
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "usersBean")
@SessionScoped
public class UsersBean extends BaseBean {

    /*private String mail;
    private String password;*/
    private List<User> users;
    private User selectedUser;

    @Inject
    private InitiativeBankServices initiativeBankServices;

    public UsersBean() {
    }

    public void searchUsers() {
        try {
            users = initiativeBankServices.searchUsers();
            FacesContext.getCurrentInstance().getExternalContext().redirect("asignarPerfil.xhtml");
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    

    /*
    public User searchUser(long id) {
        try {
            user = initiativeBankServices.searchUser(id);
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }*/
    public List<User> searchhhhUsers() {
        try {
            users = initiativeBankServices.searchUsers();
            //System.out.println(users.toString());
        } catch (Exception ex) {
            Logger.getLogger(UsersBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    /*
    public void updateUser(long documento, Rol nuevoRol) {
        System.out.println(documento);
        System.out.println(nuevoRol);
        System.out.println("dasdasssssssssssssssssssssssssssssssssssssss");
        try {
            
            initiativeBankServices.updateUsuario(documento,nuevoRol.toString() );
            FacesMessage msg;
            msg = new FacesMessage("Actualizado");
            FacesContext.getCurrentInstance().addMessage(null, msg); 
        } catch (Exception ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

}
