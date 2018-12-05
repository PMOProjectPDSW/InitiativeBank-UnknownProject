package pdsw.project.beans;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankServices;

/**
 *
 * @author 2099190
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "initiativeBean")
@SessionScoped
public class InitiativesBean extends BaseBean {	
    
    private String mail;
    private String password;
    private User user;
    private List<User> users = null;
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    public InitiativesBean() {
    }

    public User searchUser(long id) {
        try {
            user = initiativeBankServices.searchUser(id);           
        } catch (Exception ex) {
            Logger.getLogger(InitiativesBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public List<User> searchUsers() {
        try {
            System.out.println("TRYING: searchUsers Bean");
            users = initiativeBankServices.searchUsers();
            System.out.println("DONE: searchUsers Bean");
            System.out.println(users.toString());
        } catch (Exception ex) {
            Logger.getLogger(InitiativesBean.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        System.out.println(mail);
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }        
    
}