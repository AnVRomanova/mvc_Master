package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;

import java.util.List;
//https://github.com/proselytear/springbootdemo/blob/master/src/main/resources/templates/user-create.html

@Controller
@RequestMapping("/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String printUsers(Model model) {
        List<User> usersList = userService.listUsers();
        model.addAttribute("userList", usersList);

        return "users";
    }
    // получение страницы редактирования юзера
    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") long id, ModelMap model) {
        User user = userService.readUser(id);
        model.addAttribute("user", user);
        return "editPage";
    }
    // метод редактирования юзера
    @PostMapping()
    public String editUser(@ModelAttribute("user") User user) {
        System.out.println(user.toString());

         userService.edit(user);
        return "redirect:/users";
    }


}