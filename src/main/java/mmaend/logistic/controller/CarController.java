package mmaend.logistic.controller;

import mmaend.logistic.domain.Car;
import mmaend.logistic.repo.CarRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepo> {
    public CarController(CarRepo repo) {
        super(repo);
    }
}
