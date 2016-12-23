package myorg.slava.com.model;

import java.util.Collection;
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
    private Set<Role> authorities;

    public User(String name, String email, String password, Role role, Role... roles) {
        super(name);
        this.email = email;
        this.password = password;
        this.enabled = true;
        this.registered = new Date();
        this.authorities = EnumSet.of(role,roles);
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
    public  void  setAuthorities (Role role){
        if (this.authorities==null){
            EnumSet.of(role);}
        else {authorities.add(role);}
    }
    public  boolean isEnabled(){return this.enabled;}
    public Collection<Role> getAuthorities(){ return authorities;}
    public String getPassword(){return password;}

    @Override
    public String toString() {
        return "User "+name+" is registered "+registered;}
}
