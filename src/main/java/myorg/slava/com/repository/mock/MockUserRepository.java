package myorg.slava.com.repository.mock;

import myorg.slava.com.LoggerWrapper;
import myorg.slava.com.model.User;
import myorg.slava.com.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MockUserRepository implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepository.class);

    @Override
    public User save(User user) {
        LOG.info("save "+user);
        return user;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("Delete "+id);
        return true;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEMail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
