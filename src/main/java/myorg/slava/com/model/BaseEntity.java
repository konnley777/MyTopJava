package myorg.slava.com.model;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class BaseEntity {
protected Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew(){
        return this.id==null;
    }
}
