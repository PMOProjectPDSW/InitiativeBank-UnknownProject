package pdsw.project.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

/**
 * Class Initiative that defines all the
 * Initiatives made by an User
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class Initiative implements Serializable{
    
    private long id;
    private int state;
    private String title;
    private String description;
    private Date creationDate;
    private User usuario;
    private Tag tag;
    private List<Comment> comentarios;
    private List<Vote> votos;    
    //private String area;

    public Initiative() {
    }

    public Initiative(long id) {
        this.id = id;
    }

    public Initiative(long id, int state, String title, String description, Date creationDate, User usuario, Tag tag) {
        this.id = id;
        this.state = state;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.usuario = usuario;
        this.tag = tag;
    }

    public Initiative(long id, int state, String title, String description, Date creationDate, User usuario, Tag tag, List<Comment> comentarios, List<Vote> votos) {
        this.id = id;
        this.state = state;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.usuario = usuario;
        this.tag = tag;
        this.comentarios = comentarios;
        this.votos = votos;        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    
    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comment> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Vote> getVotos() {
        return votos;
    }

    public void setVotos(List<Vote> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Initiative{" + "id=" + id + ", state=" + state + ", title=" + title + ", description=" + description + ", creationDate=" + creationDate + ", usuario=" + usuario + ", tag=" + tag + ", comentarios=" + comentarios + ", votos=" + votos + '}';
    }
    
}
