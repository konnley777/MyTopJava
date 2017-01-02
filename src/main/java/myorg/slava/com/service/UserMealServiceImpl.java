package myorg.slava.com.service;


import myorg.slava.com.model.User;
import myorg.slava.com.model.UserMeal;
import myorg.slava.com.repository.UserMealRepository;
import myorg.slava.com.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMealServiceImpl implements UserMealService {
    @Autowired
    public UserMealRepository userMealRepo;


    @Override
    public void save(User user, UserMeal meal) {

    }

    @Override
    public void delete(int id,int userId) throws NotFoundException {

    }

    @Override
    public UserMeal get(int userId,int id) throws NotFoundException {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) throws NotFoundException {
        return null;
    }

    @Override
    public void deleteAll(int userId) throws NotFoundException {

    }
}
