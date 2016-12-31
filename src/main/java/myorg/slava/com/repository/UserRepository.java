package myorg.slava.com.repository;
import myorg.slava.com.model.User;



import java.util.List;


public interface UserRepository {
    User save(User user);
     //false if not found
    boolean delete(int id);

    //null is not found
    User get(int id);

    User getByEMail(String email);

    List<User> getAll();
}
