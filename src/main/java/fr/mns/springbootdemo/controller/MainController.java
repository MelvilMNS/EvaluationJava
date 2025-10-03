package fr.mns.springbootdemo.controller;


import fr.mns.springbootdemo.persistence.model.User;
import fr.mns.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class MainController {


    private final UserService userService;


    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String mainMethod(Model model) {
        List<User> users = userService.findAll();
        if(!users.isEmpty()){
            User u = users.get(0);
            model.addAttribute("user", u);
        }
        model.addAttribute("message", "Hello!");
        List<String> loop = List.of("one", "two", "three", "four", "five");
        model.addAttribute("demo_loop", loop);
        return "main";
    }
}