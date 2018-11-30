package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;
import pdsw.project.entities.Comment;

/**
 * Interface CommentMapper that connects the 
 * functionalities with the DataBase of the Comment
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface CommentMapper {
    
    public Comment getComment(@Param("comment_id") Long id);
    public ArrayList<Comment> getComments();
    
}