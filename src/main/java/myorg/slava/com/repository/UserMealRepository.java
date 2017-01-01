package myorg.slava.com.repository;

import myorg.slava.com.model.User;
import myorg.slava.com.model.UserMeal;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface UserMealRepository {

   public UserMeal save(UserMeal userMeal, int userId);

  public   boolean delete (UserMeal userMeal, int userId);

  public User get(int id, int userId);

  public   List<UserMeal> getAll(int userId);

    public   void deleteAll(int userId);

   public void update(UserMeal userMeal);

    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
