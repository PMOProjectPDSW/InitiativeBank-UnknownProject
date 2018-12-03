package pdsw.project.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Class Comment that defines all the
 * Comments made for an Initiative by an User
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class Comment implements Serializable {

    private long id;
    private String description;
    private Date creationDate;
    private User usuario;
    private Initiative iniciativa;

    public Comment() {
    }

    public Comment(long id) {
        this.id = id;
    }

    public Comment(long id, String description, Date creationDate, User usuario, Initiative iniciativa) {
        this.id = id;
        this.description = description;
        this.creationDate = creationDate;
        this.usuario = usuario;
        this.iniciativa = iniciativa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Initiative getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Initiative iniciativa) {
        this.iniciativa = iniciativa;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", description=" + description + ", creationDate=" + creationDate + ", usuario=" + usuario + ", iniciativa=" + iniciativa + '}';
    }

}
