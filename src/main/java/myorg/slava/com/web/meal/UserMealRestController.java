package myorg.slava.com.web.meal;

import myorg.slava.com.LoggedUser;
import myorg.slava.com.LoggerWrapper;
import myorg.slava.com.model.UserMeal;
import myorg.slava.com.service.UserMealServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserMealRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);
@Autowired
    private UserMealServiceImpl service;

    public UserMeal get(int id){
        int userId = LoggedUser.getId();
        LOG.info("get meal {} for user {}",id,userId);
        return service.get(id,userId);
    }
    public void delete (int id){
        int userId =LoggedUser.getId();
        LOG.info("deleting user meal by {} id",id);
        service.delete(id,userId);
    }

    public List<UserMeal> getAll(){
        int userId =LoggedUser.getId();
        LOG.info("get all user meal by {} id",userId);
        return service.getAll(userId);
    }

    public void deleteAll(){
        int userId =LoggedUser.getId();
        LOG.info("delete all user meal by {} id",userId);
        service.deleteAll(userId);
    }
}
