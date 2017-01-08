package myorg.slava.com.service;

import myorg.slava.com.model.User;
import myorg.slava.com.repository.UserRepository;
import myorg.slava.com.util.exception.ExceptionUtil;
import myorg.slava.com.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Qualifier("userRepository")
    @Autowired
    private UserRepository repository;

    @Override
    public void create(User user) {

    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id)  {
        ExceptionUtil.check(repository.delete(id),id);
    }

    @Override
    public User get(int id) throws NotFoundException {
        return ExceptionUtil.check(repository.get(id),id);
    }

    @Override
    public User getByEMail(String email) throws NotFoundException {
        return ExceptionUtil.check(repository.getByEMail(email),"email "+email);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public void update(User user) throws NotFoundException {
        ExceptionUtil.check(repository.save(user),user.getId());
    }
}
