package pdsw.project.entities;

import java.io.Serializable;

/**
 * Class Tag that defines all the
 * Tags an Initiative could have
 * @author Pedro Mayorga - PeNav
 * @version 1.0
 * @since 2018-11-23
 */
public class Tag implements Serializable {

    private long id;
    private String description;

    public Tag() {
    }

    public Tag(long id) {
        this.id = id;
    }

    public Tag(long id, String description) {
        this.id = id;
        this.description = description;
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

    @Override
    public String toString() {
        return "Tag{" + "id=" + id + ", description=" + description + '}';
    }
        
}
