package pdsw.project.persistence.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import java.util.List;

import pdsw.project.entities.Comment;

/**
 * Interface CommentDAO that defines all the
 * functionalities related with a Comment
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface CommentDAO {
    
    public Comment load(long id) throws PersistenceException;
    public List<Comment> loadAll() throws PersistenceException;
    
    //implement
    //public void save(Initiative initia) throws PersistenceException;
    
}
