package web.Service;

import org.springframework.stereotype.Service;
import web.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> carNumber(List<Car> carList, Integer n) {
        if (n==null || n<1) {
            return carList.subList(0,0);
        } else if (n>5){
            return carList;
        } else {
            return carList.subList(0, n);
        }
    }
}
