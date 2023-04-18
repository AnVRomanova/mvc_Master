package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.model.Car;
import web.config.service.CarService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/cars")
public class Cars {

    @GetMapping
    public String printWelcome(@RequestParam (value = "count", defaultValue = "5") Integer n, Model model) {
        List<Car> carList = new CarService().getAllCars();
        List<Car> result = new ArrayList<>();
        if (n > 0) {
            result = Stream.iterate(0, x -> x + 1)
                    .limit(n).
                    map(carList::get)
                    .collect(Collectors.toList());

        }
        model.addAttribute("result", result);
        return "cars";
    }

}