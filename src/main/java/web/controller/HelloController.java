package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.dao.CarDAO;
import web.model.Car;
import web.servise.CarService;
import web.servise.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private CarService carService;

    public HelloController() {
        carService = new CarServiceImpl();
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam("count") int count, ModelMap model) {
        List<Car> carsList = carService.getCars(count);
        model.addAttribute("list", carsList);
        return "car";
    }

}