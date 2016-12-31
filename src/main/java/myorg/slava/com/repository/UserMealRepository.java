package myorg.slava.com.repository;

//import org.springframework.stereotype.Repository;


import myorg.slava.com.model.User;
import myorg.slava.com.model.UserMeal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * v.seregin
 * on 08.11.2016.
 */

public interface UserMealRepository {

   public UserMeal save(UserMeal userMeal, int userId);

  public   boolean delete (UserMeal userMeal, int userId);

  public User get(int id, int userId);

  public   List<UserMeal> getAll(int userId);

    public   void deleteAll(int userId);

   public void update(UserMeal userMeal);

    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
