package pdsw.project.services.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
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
    System.out.println("----------|username|user.getEmail()|");
    System.out.println("----------|"+username+"|"+user.getEmail()+"|"); 
    */

    /**
     *
     * @param username
     * @param password
     * @return
     * @throws InitiativeBankException
     */
    @Override
    public boolean checkLogin(String username, String password) {//throws InitiativeBankException {
        //try {
            User user = userDAO.load(username);
            boolean loginAccess;                                  
            System.out.println("----------|username|user.getEmail()|");
            System.out.println("----------|"+username+"|"+user.getEmail()+"|");
            System.out.println("----------|password|user.getPassword()|");
            System.out.println("----------|"+password+"|"+user.getPassword()+"|");
            if ((user.getEmail().equals(username)) && (user.getPassword().equals(password))) {         
                loginAccess = true;
            } else {
                loginAccess = false;
                FacesMessage growlMessage = new FacesMessage("Inicio de Sesión Incorrecto", "El usuario no se ha autenticado correctamente.");
                FacesContext.getCurrentInstance().addMessage(null, growlMessage);
            }
            System.out.println("----------|loginAccess|"+loginAccess+"|");
            return loginAccess;
        //} catch (PersistenceException ex) {
            //throw new InitiativeBankException("\nERROR:\nClass: InitiativeBankServicesImpl\n-Method: checkLogin()\nNo se pudo loggear correctamente\n", ex);
        //}
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
    public User searchUser(long id) throws InitiativeBankException {
        try {
            return userDAO.load(id);
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudo encontrar al Usuario", ex);
        }
    }

    @Override
    public List<User> searchUsers() throws InitiativeBankException {
        List<User> users;
        try {
            users = userDAO.loadAll();
            return userDAO.loadAll();
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("\nERROR:\nNo se pudieron listar todos los Usuarios", ex);
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

    @Override
    public List<Initiative> searchInitiatives() throws InitiativeBankException {
        try {
            return initiativeDAO.loadAll();
        } catch (PersistenceException ex) {
            throw new InitiativeBankException("ERROR:\nNo se pudo encontrar la Iniciativa", ex);
        }
    }

    //Insertar Usuario
    //Insertar Iniciativa
}
