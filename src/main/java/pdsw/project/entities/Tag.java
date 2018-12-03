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
    private String tag;

    public Tag() {
    }

    public Tag(long id) {
        this.id = id;
    }

    public Tag(long id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Tag{" + "id=" + id + ", tag=" + tag + '}';
    }
        
}
