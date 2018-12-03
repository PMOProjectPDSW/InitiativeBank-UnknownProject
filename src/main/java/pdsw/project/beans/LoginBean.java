package pdsw.project.beans;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean extends BaseBean {

    private String username;
    private String password;
    private User user;

    @Inject
    private InitiativeBankServices initiativeBankServices;

    /**
     * Bean que se encarga de autenticar usuarios
     */
    public LoginBean() {
    }
    
    public void doLogin() throws InitiativeBankException {
        boolean loginState;        
        try {
            loginState = initiativeBankServices.checkLogin(username, password);
            if (loginState) {
                user = initiativeBankServices.searchUser(username);
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            }
        } catch (InitiativeBankException ex) {
            throw new InitiativeBankException("\nERROR:\nClass: LoginBean\n-Method: doLogin()\nNo se pudo loggear correctamente el usuario: " + username, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
