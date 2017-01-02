package myorg.slava.com;

import myorg.slava.com.model.Role;

import java.util.Set;

/**
 * v.seregin
 * on 08.11.2016.
 */
public  class LoggedUser {
    protected static int id;
    protected Set<Role> roles;
    protected boolean enabled=true;

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


}
