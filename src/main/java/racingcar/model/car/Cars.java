package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void createCarList(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
    }
}
