package pdsw.project.entities;

import java.io.Serializable;

/**
 * Class Vote that defines all the
 * Votes made for an Initiative by an User
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class Vote implements Serializable{
    
    private long id;
    private boolean vote;
    private User usuario;
    private Initiative iniciativa;

    public Vote() {
    }

    public Vote(long id) {
        this.id = id;
    }

    public Vote(long id, boolean vote, User usuario, Initiative iniciativa) {
        this.id = id;
        this.vote = vote;
        this.usuario = usuario;
        this.iniciativa = iniciativa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
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
        return "Vote{" + "id=" + id + ", vote=" + vote + ", usuario=" + usuario + ", iniciativa=" + iniciativa + '}';
    }     
    
}
