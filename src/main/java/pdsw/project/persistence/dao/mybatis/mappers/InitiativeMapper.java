package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.List;
import pdsw.project.entities.Initiative;
import org.apache.ibatis.annotations.Param;

/**
 * Interface InitiativeMapper that connects the 
 * functionalities with the DataBase of the Initiative
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public interface InitiativeMapper {
    
    public Initiative getInitiative(@Param("initiative_id") long id);
    public List<Initiative> getInitiatives();
    //TO DOOO
    //void addIntention(@Param("int") Intention inten);
    
}