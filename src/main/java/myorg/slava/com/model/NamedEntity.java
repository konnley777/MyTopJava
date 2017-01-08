package myorg.slava.com.model;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class NamedEntity extends BaseEntity{
    protected String name;

    public NamedEntity() {}

    public NamedEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public NamedEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
