package myorg.slava.com.model;

import myorg.slava.com.LoggerWrapper;

import java.util.Objects;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class BaseEntity {
protected static final LoggerWrapper LOG = LoggerWrapper.get(BaseEntity.class);
    public static final int START_SEO =10000;
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

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BaseEntity other = (BaseEntity) obj;
        return Objects.equals(this.id, other.id);
    }
}
