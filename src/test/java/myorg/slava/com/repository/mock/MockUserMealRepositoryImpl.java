package myorg.slava.com.repository.mock;

import myorg.slava.com.model.UserMeal;
import myorg.slava.com.repository.UserMealRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class MockUserMealRepositoryImpl implements UserMealRepository {
    @Override
    public UserMeal save(UserMeal userMeal, int userId) {
        return null;
    }

    @Override
    public boolean delete(UserMeal userMeal, int userId) {
        return false;
    }

    @Override
    public UserMeal get(int id,  int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public void update(UserMeal userMeal) {

    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
