package pdsw.project.services;

import pdsw.project.entities.Initiative;
import pdsw.project.entities.User;
import java.util.List;

/**
 * Interface InitiativeBankServices that defines all the
 * functionalities of the WebApp
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface InitiativeBankServices {    

    public boolean checkLogin(String username, String password) throws InitiativeBankException;
    public User searchUser(String email) throws InitiativeBankException;
    public List<User> searchUsers() throws InitiativeBankException;
    
    
    
    
    
    public User searchUser(long id) throws InitiativeBankException;
    
    ////////
    public Initiative searchInitiative(long id) throws InitiativeBankException;
    public List<Initiative> searchInitiatives() throws InitiativeBankException;
    
}