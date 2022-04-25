package racingcar.model.car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.Config;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        List<Car> winner = new LinkedList<>();

        this.cars.forEach(car -> {
            if (car.getDistance() == this.highestDistance) {
                winner.add(car);
            }
        });

        return winner;
    }
}
