package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.Service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarPage {
    private CarService carService;

    @Autowired
    public CarPage(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value="/cars")
    public String getCar(@RequestParam(value = "count", required = false) Integer num,
                         Model model) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Germany", 400));
        carList.add(new Car("Mercedes", "Germany", 300));
        carList.add(new Car("Lada", "Russia", 100));
        carList.add(new Car("Mazda", "Japan", 200));
        carList.add(new Car("Bugatti", "Italy", 500));

        model.addAttribute("carList", carService.carNumber(carList, num));
        return "cars";
    }
}
