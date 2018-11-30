package pdsw.project.services;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * Exception Class InitiativeBankException that defines
 * all the exceptions of the project
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class InitiativeBankException extends Exception {

    public static final String EXCEPTIONS = "";
    
    /**
     * Creates a new instance of <code>InitiativeBankException</code> without
     * detail message.
     */
    public InitiativeBankException() {
    }

    /**
     * Constructs an instance of <code>InitiativeBankException</code> with the
     * specified detail message.     *
     * @param message the detail message.
     */
    public InitiativeBankException(String message) {
        super(message);
    }
    
    public InitiativeBankException(Throwable error) {
        super(error);
    }
    
    public InitiativeBankException(String message, Throwable error){
        super(message, error);
    }
    
    public InitiativeBankException(String message, PersistenceException exception) {
        super(message);
    }
}
