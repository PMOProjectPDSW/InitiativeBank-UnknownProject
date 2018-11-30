package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Comment;
import pdsw.project.persistence.dao.CommentDAO;
import pdsw.project.persistence.dao.mybatis.mappers.CommentMapper;

/**
 * Class MyBatisCommentDAO that implements all the
 * functionalities related with a Comment
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisCommentDAO implements CommentDAO{
    
    @Inject
    private CommentMapper commentMapper;
    
    @Override
    public Comment load(long id) throws PersistenceException {
        try {
            return commentMapper.getComment(id);
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudo mostrar el Comentario.", ex);
        }  
    }
    
    @Override
    public List<Comment> loadAll() throws PersistenceException {
        try {
            return commentMapper.getComments();
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudieron mostrar todas los Comentarios.", ex);
        }              
    }    
    
}