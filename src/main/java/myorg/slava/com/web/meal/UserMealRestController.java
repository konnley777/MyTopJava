package myorg.slava.com.web.meal;

import myorg.slava.com.service.UserMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserMealRestController {
@Autowired
    private UserMealService service;
}
