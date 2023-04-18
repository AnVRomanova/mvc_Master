package web.config.service;

import web.config.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static List<Car> carList = new ArrayList<>();

    public static List<Car> getAllCars() {
        carList.add(new Car("Acura", "Red", "Anna"));
        carList.add(new Car("Alfa Romeo", "Blue", "Anna"));
        carList.add(new Car("Bugatti", "Red", "Anna"));
        carList.add(new Car("Dodge", "Green", "Anna"));
        carList.add(new Car("Porsche", "Black", "Anna"));
        return  carList;
    }
}
