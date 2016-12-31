package myorg.slava.com.service;

import myorg.slava.com.model.User;
import myorg.slava.com.repository.UserRepository;
import myorg.slava.com.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by home on 31.12.2016.
 */
public class UserServiceImpl implements UserService {
    private UserRepository repository;
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEMail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) throws NotFoundException {

    }
}
