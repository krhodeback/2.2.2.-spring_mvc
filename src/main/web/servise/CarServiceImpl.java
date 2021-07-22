package web.servise;

import java.util.List;

import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

public class CarServiceImpl implements CarService {

    private CarDAO carDao;

    public CarServiceImpl() {
        carDao = new CarDAOImpl();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

}
