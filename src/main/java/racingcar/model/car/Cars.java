package racingcar.model.car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;
    private int highestDistance;

    private void setHighestDistance(int distance) {
        if (distance > this.highestDistance) {
            this.highestDistance = distance;
        }
    }

    public Cars() {
        this.cars = new ArrayList<>();
        this.highestDistance = 0;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void createCarList(String[] names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void race() {
        cars.forEach(car -> {
            car.setDistance(Randoms.pickNumberInRange(Config.RANDOM_MIN, Config.RANDOM_MAX));
            this.setHighestDistance(car.getDistance());
        });
    }


    public List<Car> getWinnners() {
        return this.cars.stream().filter(car -> car.getDistance() == this.highestDistance).collect(Collectors.toList());
    }
}
