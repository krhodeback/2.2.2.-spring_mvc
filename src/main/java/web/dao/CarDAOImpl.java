package web.dao;

import java.util.ArrayList;
import java.util.List;

import web.model.Car;

public class CarDAOImpl implements CarDAO {

    private List<Car> carsList;

    public CarDAOImpl() {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "model1", "owner1"));
        carsList.add(new Car(2, "model2", "owner2"));
        carsList.add(new Car(3, "model3", "owner3"));
        carsList.add(new Car(4, "model4", "owner4"));
        carsList.add(new Car(5, "model5", "owner5"));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> finalList = new ArrayList<>();
        if (count <= 5) {
            carsList.stream().limit(count).forEach(e -> finalList.add(e));
        } else {
            carsList.stream().limit(carsList.size()).forEach(e -> finalList.add(e));
        }
        return finalList;

    }

}
