package pdsw.project.services.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Initiative;
import pdsw.project.entities.User;
import pdsw.project.persistence.dao.InitiativeDAO;
import pdsw.project.persistence.dao.UserDAO;
import pdsw.project.persistence.dao.CommentDAO;
import pdsw.project.persistence.dao.VoteDAO;
import pdsw.project.services.InitiativeBankException;
import pdsw.project.services.InitiativeBankServices;

/**
 * Interface InitiativeBankServices that defines all the functionalities of the
 * WebApp
 *
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
@Singleton
public class InitiativeBankServicesImpl implements InitiativeBankServices {

    @Inject
    private UserDAO userDAO;

    @Inject
    private InitiativeDAO initiativeDAO;

    @Inject
    private CommentDAO commentDAO;

    @Inject
    private VoteDAO voteDAO;

    public InitiativeBankServicesImpl() {
    }

    /*
    System.out.println("\n\n\n----------|username|user.getEmail()|");
    System.out.println("\n\n\n----------|"+username+"|"+user.getEmail()+"|"); 
    System.out.println("\n\n\n----------|users|\n"+users);
     */
    /**
     *
     * @param username
     * @param password
     * @return
     * @throws InitiativeBankException
     */
    @Override
    public boolean checkLogin(String username, String password) throws InitiativeBankException {
        try {
            User user = userDAO.load(username);
            boolean loginAccess;
            if ((user.getEmail().equals(username)) && (user.getPassword().equals(password))) {
                loginAccess = true;
            } else {
                loginAccess = false;
                FacesMessage growlMessage = new FacesMessage("Inicio de Sesión Incorrecto", "El usuario no se ha autenticado correctamente.");
                FacesContext.getCurrentInstance().addMessage(null, growlMessage);
            }
            return loginAccess;
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nClass: InitiativeBankServicesImpl\n-Method: checkLogin()\nNo se pudo loggear correctamente\n", ex);
        }
    }

    @Override
    public List<User> searchUsers() throws InitiativeBankException {
        try {
            return userDAO.loadAll();
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudieron listar todos los Usuarios", ex);
        }
    }

    @Override
    public User searchUser(String email) throws InitiativeBankException {
        try {
            return userDAO.load(email);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudo encontrar al Usuario", ex);
        }
    }

    @Override
    public void changeRole(long id, String newRole) throws InitiativeBankException {
        try {
            userDAO.updateRole(id, newRole);
        } catch (NullPointerException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudieron listar todos los Usuarios", ex);
        }
    }

    @Override
    public void addInitiative(String title, String description, String newStatus, Date creationDate, String field, String keyWords, long user_id, long tag_id) {
        initiativeDAO.addInitiative(title, description, newStatus, creationDate, field, keyWords, user_id, tag_id);
    }

    @Override
    public List<Initiative> searchInitiatives() {
        return initiativeDAO.loadAll();

    }
    
    @Override
    public List<Initiative> searchInitiativesProponent(long user_id) {
        return initiativeDAO.loadAllProponent(user_id);
    }
    
    @Override
    public void changeStatus(long id, String newStatus) {
        initiativeDAO.updateStatus(id, newStatus);
    }
    
    
    
    
    
    

    @Override
    public User searchUser(long id) throws InitiativeBankException {
        try {
            return userDAO.load(id);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudo encontrar al Usuario", ex);
        }
    }

    @Override
    public Initiative searchInitiative(long id) throws InitiativeBankException {
        try {
            return initiativeDAO.load(id);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("ERROR:\nNo se pudo encontrar la Iniciativa", ex);
        }
    }

    //Insertar Usuario
    //Insertar Iniciativa

    

    
}
