package web.servise;

import java.util.List;

import web.model.Car;

public interface CarService {
    List<Car> getCars(int count);
}
