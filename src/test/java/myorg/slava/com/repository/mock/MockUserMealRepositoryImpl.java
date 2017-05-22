package myorg.slava.com.repository.mock;

import myorg.slava.com.LoggerWrapper;
import myorg.slava.com.model.UserMeal;
import myorg.slava.com.repository.UserMealRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class MockUserMealRepositoryImpl implements UserMealRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserMealRepositoryImpl.class);


    @PostConstruct
    public void postConstruct(){
        LOG.info("post Construct"); }

    @PreDestroy
    public void preDestroy(){
        LOG.info("pre destroy");
    }
    @Override
    public UserMeal save(UserMeal userMeal, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return true;
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
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
