package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String printWelcome(@RequestParam (value = "count", defaultValue = "5") Integer n, Model model) {
        List<Car> result = new CarService().getAllCars(n);
        model.addAttribute("result", result);

        return "cars";
    }

}