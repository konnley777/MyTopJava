package myorg.slava.com.service;


import myorg.slava.com.model.User;
import myorg.slava.com.model.UserMeal;
import myorg.slava.com.util.exception.NotFoundException;

import java.util.List;

public interface UserMealService {

    public void save(User user, UserMeal meal);
    public void delete (int id,int userId) throws NotFoundException;
    public UserMeal get(int userId,int id) throws NotFoundException;
    public List<UserMeal> getAll(int userId) throws NotFoundException;
    public void deleteAll (int userId) throws NotFoundException;
}
