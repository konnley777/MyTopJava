package myorg.slava.com.web.meal;

import myorg.slava.com.LoggedUser;
import myorg.slava.com.LoggerWrapper;
import myorg.slava.com.model.UserMeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserMealRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserMealRestController.class);
@Autowired
private  myorg.slava.com.service.UserMealServiceImpl service;

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

    public void update(UserMeal userMeal){
        int id = LoggedUser.getId();
        LOG.info("update usermeal from controller");
        service.update(userMeal,id);
    }
    public void create(UserMeal userMeal){
        int id = LoggedUser.getId();
        LOG.info("create usermeal from controller");
        service.save(userMeal,id);
    }
    public List<UserMeal> getBetween(LocalDateTime start, LocalDateTime end){
        int id = LoggedUser.getId();
        LOG.info("get list of usermeal from controller");
        return service.getBetween(start,end,id);
    }
}
