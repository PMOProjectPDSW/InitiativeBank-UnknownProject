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
    private String title;
    private String description;
    private String status;    
    private Date creationDate;
    private String field;
    private String keyWords;
    private User usuario;
    private Tag tag;
    private List<Comment> comentarios;
    private List<Vote> votos;

    public Initiative() {
    }

    public Initiative(long id) {
        this.id = id;
    }

    public Initiative(long id, String title, String description, String status, Date creationDate, String field, String keyWords, User usuario, Tag tag) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;        
        this.creationDate = creationDate;
        this.field = field;
        this.keyWords = keyWords;
        this.usuario = usuario;
        this.tag = tag;
    }

    public Initiative(long id, String title, String description, String status, Date creationDate, String field, String keyWords, User usuario, Tag tag, List<Comment> comentarios, List<Vote> votos) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;        
        this.creationDate = creationDate;
        this.field = field;
        this.keyWords = keyWords;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
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
        return "Initiative{" + "id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + ", creationDate=" + creationDate + ", field=" + field + ", keyWords=" + keyWords + ", usuario=" + usuario + ", tag=" + tag + ", comentarios=" + comentarios + ", votos=" + votos + '}';
    }
    
}
