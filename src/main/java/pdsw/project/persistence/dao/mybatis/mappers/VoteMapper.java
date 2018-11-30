package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;
import pdsw.project.entities.Vote;

/**
 * Interface VoteMapper that connects the 
 * functionalities with the DataBase of the Vote
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface VoteMapper {
    
    public Vote getVote(@Param("vote_id") Long id);
    public ArrayList<Vote> getVotes();
    
}