package pdsw.project.beans;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
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

    private List<User> users;
    private List<User> filteredUsers;
    private User selectedUser;
    private List<String> roles = Arrays.asList("Administrador", "Personal de PMO - ODI", "Proponente de iniciativa o idea de proyecto", "Usuarios de consulta");
    private String newRole;

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

    public void updateRole() {
        try {
            if (selectedUser == null || newRole.equals("")) {
                FacesMessage growlMessage = new FacesMessage("No se pudo cambiar el Rol", "No se ha seleccionado al Usuario o el nuevo Rol");
                FacesContext.getCurrentInstance().addMessage(null, growlMessage);
            } else {
                initiativeBankServices.changeRole(selectedUser.getId(), newRole);
                selectedUser.setRole(newRole);                
                FacesContext.getCurrentInstance().getExternalContext().redirect("asignarPerfil.xhtml");               
            }
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

    public List<User> getFilteredUsers() {
        return filteredUsers;
    }

    public void setFilteredUsers(List<User> filteredUsers) {
        this.filteredUsers = filteredUsers;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }

}
