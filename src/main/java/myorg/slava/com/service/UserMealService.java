package myorg.slava.com.service;


import myorg.slava.com.model.UserMeal;
import myorg.slava.com.util.exception.NotFoundException;

import java.time.LocalDate;
import java.util.List;

public interface UserMealService {

    public void save(UserMeal meal,int id);
    public void delete (int id,int userId) throws NotFoundException;
    public UserMeal get(int userId,int id) throws NotFoundException;
    public List<UserMeal> getAll(int userId) throws NotFoundException;
    public void deleteAll (int userId) throws NotFoundException;
    public void update (UserMeal meal,int userId) throws NotFoundException;
    public List<UserMeal> getBetween(LocalDate begin, LocalDate end, int userId) throws NotFoundException;
}
