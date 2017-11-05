package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration()
    {
        return "registration";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String home() { return "index";}

}
