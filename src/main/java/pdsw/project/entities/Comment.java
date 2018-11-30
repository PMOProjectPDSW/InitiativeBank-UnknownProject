package pdsw.project.entities;

import java.io.Serializable;

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
    private User usuario;
    private Initiative iniciativa;

    public Comment() {
    }

    public Comment(long id) {
        this.id = id;
    }

    public Comment(long id, String description, User usuario, Initiative iniciativa) {
        this.id = id;
        this.description = description;
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
        return "Comment{" + "id=" + id + ", description=" + description + ", usuario=" + usuario + ", iniciativa=" + iniciativa + '}';
    }

}
