
package myorg.slava.com.service;
import myorg.slava.com.model.User;
import myorg.slava.com.util.exception.NotFoundException;

import java.util.List;

/**
 * v.seregin
 * on 08.11.2016.
 */
public interface UserService {
    public User save(User user);
    //false if not found
    public void delete(int id) throws NotFoundException;

    //null is not found
    public User get(int id) throws NotFoundException;

    public User getByEMail(String email) throws NotFoundException;

    public  List<User> getAll();
    public void update(User user)throws NotFoundException;


}
