package myorg.slava.com.web.user;

import myorg.slava.com.LoggedUser;
import myorg.slava.com.LoggerWrapper;
import myorg.slava.com.model.User;
import myorg.slava.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserRestController.class);
  @Autowired
    private UserService service;

public User get() {
int id = LoggedUser.id();
 LOG.info("get some logging user");
    return service.get(id);
}
    public void delete() {
        int id = LoggedUser.id();
        LOG.info("delete some logging user");
         service.delete(id);
    }
    public void update(User user) {
        int id = LoggedUser.id();
        LOG.info("update some logging user");
        service.update(user);
    }
}
