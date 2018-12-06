package pdsw.project.persistence.dao.mybatis.mappers;

import java.util.Date;
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
    public void addInitiative(@Param("initiative_title") String title, @Param("initiative_description") String description, @Param("initiative_status") String newStatus, @Param("initiative_creationdate") Date creationDate, @Param("initiative_field") String field, @Param("initiative_keyWords") String keyWords, @Param("initiative_user_id") long user_id, @Param("initiative_tag_id") long tag_id);
    public void updateStatus(@Param("initiative_id") long id, @Param("initiative_status") String newStatus);
    public List<Initiative> getInitiativesProponent(@Param("user_id") long user_id);
    
    
    
    //TO DOOO
    //void addIntention(@Param("int") Intention inten);

    

    

        
}