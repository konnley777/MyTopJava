package myorg.slava.com.service;


import myorg.slava.com.model.UserMeal;
import myorg.slava.com.repository.UserMealRepository;
import myorg.slava.com.util.exception.ExceptionUtil;
import myorg.slava.com.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserMealServiceImpl implements UserMealService {
    @Qualifier("userMealRepository")
    @Autowired
    public UserMealRepository repository;


    @Override
    public void save(UserMeal meal, int id) {

    }

    @Override
    public void delete(int id,int userId) throws NotFoundException {

    }

    @Override
    public UserMeal get(int id,int userId) throws NotFoundException {
        return ExceptionUtil.check(repository.get(id, userId),id);
    }

    @Override
    public List<UserMeal> getAll(int userId) throws NotFoundException {
        return null;
    }

    @Override
    public void deleteAll(int userId) throws NotFoundException {

    }

    @Override
    public void update(UserMeal meal, int userId) throws NotFoundException {

    }

    @Override
    public List<UserMeal> getBetween(LocalDate begin, LocalDate end, int userId) throws NotFoundException {
        return null;
    }
}
