package pdsw.project.persistence.dao.mybatis;

import com.google.inject.Inject;
import java.util.List;
import org.apache.ibatis.exceptions.PersistenceException;
import pdsw.project.entities.Vote;
import pdsw.project.persistence.dao.VoteDAO;
import pdsw.project.persistence.dao.mybatis.mappers.VoteMapper;

/**
 * Class MyBatisVoteDAO that implements all the
 * functionalities related with a Vote
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class MyBatisVoteDAO implements VoteDAO{
    
    @Inject
    private VoteMapper voteMapper;
    
    @Override
    public Vote load(long id) throws PersistenceException {
        try {
            return voteMapper.getVote(id);
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudo mostrar el Voto.", ex);
        }  
    }
    
    @Override
    public List<Vote> loadAll() throws PersistenceException {
        try {
            return voteMapper.getVotes();
        } catch (Exception ex) {
            throw new PersistenceException("ERROR MyBATIS:\nNo se pudieron mostrar todas los Votos.", ex);
        }              
    }    
    
}