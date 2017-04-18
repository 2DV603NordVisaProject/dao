package spring_rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private IUserDAO dao = new UserDAOMongoDB();

    @RequestMapping("/user/{id}")
    String getUser(@PathVariable String id) {
        return dao.getUser(id).toString();
    }
}
