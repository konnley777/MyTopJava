package myorg.slava.com.service;


import myorg.slava.com.repository.UserMealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMealService {
    @Autowired
    public UserMealRepository userMealRepo;


}
