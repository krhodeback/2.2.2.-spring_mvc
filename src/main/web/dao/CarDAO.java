package web.dao;

import java.util.List;

import web.model.Car;

public interface CarDAO {
    List<Car> getCars(int count);
}
