package myorg.slava.com.web.user;

import myorg.slava.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminUserRestController {
@Autowired
    private UserService service;
}
