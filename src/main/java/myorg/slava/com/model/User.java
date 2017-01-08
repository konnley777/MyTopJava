package myorg.slava.com.model;

import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * v.seregin
 * on 02.11.2016.
 */
public class User extends NamedEntity{
private String email;
private String password;
    private boolean enabled=true;
    private Date registered=new Date();
    private Set<Role> roles;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
    }

    public User(Integer id, String name, String email, String password, boolean enabled, Role role, Role... roles) {
        this(id, name, email, password, enabled, EnumSet.of(role, roles));
    }

    public User(Integer id, String name, String email, String password, boolean enabled, Set<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public  void setRoles(Role role){
        if (this.roles ==null){
            EnumSet.of(role);}
        else {
            roles.add(role);}
    }
    public  boolean isEnabled(){return this.enabled;}
    public Set<Role> getRoles(){ return roles;}
    public String getPassword(){return password;}

    @Override
    public String toString() {
        return "User "+name+" is registered "+registered;}
}
