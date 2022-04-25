package racingcar.model.car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.Config;

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

    public void race() {
        cars.forEach(car -> {
            car.setDistance(Randoms.pickNumberInRange(Config.RANDOM_MIN, Config.RANDOM_MAX));
        });
    }
}
