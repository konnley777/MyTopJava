package myorg.slava.com.repository;



import myorg.slava.com.model.UserMeal;

import java.time.LocalDateTime;
import java.util.List;

/**
 * GKislin
 * 06.03.2015.
 */
public interface UserMealRepository {

    // UserMeal.user = null
    UserMeal save(UserMeal userMeal, int userId);

    // false if not found
    boolean delete(int id, int userId);

    // null if not found
    UserMeal get(int id, int userId);

    // ORDERED DATE, TIME
    List<UserMeal> getAll(int userId);

    void deleteAll(int userId);

    List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);

}
