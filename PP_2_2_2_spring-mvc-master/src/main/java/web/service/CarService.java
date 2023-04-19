package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarService implements CarServiceInterface{

    private static List<Car> carList = new ArrayList<>();
    private static List<Car> result = new ArrayList<>();

    public List<Car> getAllCars(int n) {
        carList.add(new Car("Acura", "Red", "Anna"));
        carList.add(new Car("Alfa Romeo", "Blue", "Anna"));
        carList.add(new Car("Bugatti", "Red", "Anna"));
        carList.add(new Car("Dodge", "Green", "Anna"));
        carList.add(new Car("Porsche", "Black", "Anna"));

        if (n > 0) {
            result = Stream.iterate(0, x -> x + 1)
                    .limit(n).
                    map(carList::get)
                    .collect(Collectors.toList());
        }
        return  result;
    }
}
