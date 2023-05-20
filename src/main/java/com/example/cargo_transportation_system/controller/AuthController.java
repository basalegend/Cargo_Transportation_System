package com.example.cargo_transportation_system.controller;

import com.example.cargo_transportation_system.dto.UserDto;
import com.example.cargo_transportation_system.entity.User;
import com.example.cargo_transportation_system.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Контроллер аутентификации и регистрации пользователей.
 */
@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Обработчик GET-запроса для отображения домашней страницы.
     *
     * @return имя представления для домашней страницы
     */
    @GetMapping("index")
    public String home(){
        return "index";
    }

    /**
     * Обработчик GET-запроса для отображения формы входа.
     *
     * @return имя представления для формы входа
     */
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    /**
     * Обработчик GET-запроса для отображения формы регистрации пользователя.
     *
     * @param model объект Model для передачи данных в представление
     * @return имя представления для формы регистрации
     */
    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    /**
     * Обработчик POST-запроса для регистрации пользователя.
     *
     * @param user   объект UserDto с данными пользователя
     * @param result объект BindingResult для проверки ошибок валидации
     * @param model  объект Model для передачи данных в представление
     * @return имя представления для результата регистрации или перенаправление на другую страницу в случае успеха
     */
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "Аккаунт с такой почтой уже есть!");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }
}
