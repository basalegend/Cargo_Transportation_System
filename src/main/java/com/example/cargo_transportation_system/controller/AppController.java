package com.example.cargo_transportation_system.controller;

import java.util.List;

import com.example.cargo_transportation_system.entity.Cargo;
import com.example.cargo_transportation_system.service.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Класс-контроллер для обработки HTTP-запросов, связанных с грузами
 */
@Controller
public class AppController {

    /**
     * Сервис для выполнения операций с грузами
     */
    @Autowired
    private CargoService service;

    /**
     * Обрабатывает GET-запрос на главную страницу
     *
     * @param model   объект модели, содержащий атрибуты для передачи на страницу
     * @param keyword ключевое слово для поиска грузов
     * @return имя представления главной страницы
     */
    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Cargo> listCargo = service.listAll(keyword);
        Cargo newCargo = new Cargo();
        model.addAttribute("newCargo", newCargo);
        model.addAttribute("listCargo", listCargo);
        model.addAttribute("keyword", keyword);
        model.addAttribute("isAdmin", SecurityContextHolder
                                                .getContext()
                                                .getAuthentication()
                                                .getAuthorities()
                                                .stream()
                                                .anyMatch(a -> a.getAuthority().equals("ADMIN")));
        return "index";
    }

    /**
     * Обрабатывает POST-запрос на создание нового груза
     *
     * @param cargo объект груза, переданный из формы создания груза
     * @return перенаправление на главную страницу
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCargo(@ModelAttribute("cargo") Cargo cargo) {
        service.save(cargo);
        return "redirect:/";
    }

    /**
     * Обрабатывает GET-запрос на страницу редактирования груза
     *
     * @param id идентификатор груза для редактирования
     * @return объект представления страницы редактирования груза и соответствующего ему груза
     */
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditCargoForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_cargo");
        Cargo cargo = service.get(id);
        mav.addObject("editCargo", cargo);
        return mav;
    }

    /**
     * Обрабатывает GET-запрос на удаление груза
     *
     * @param id идентификатор груза для удаления
     * @return перенаправление на главную страницу
     */
    @RequestMapping("/delete/{id}")
    public String deleteCargo(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }

}

