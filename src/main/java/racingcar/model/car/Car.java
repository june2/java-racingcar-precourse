package racingcar.model.car;

import racingcar.constant.Config;
import racingcar.vo.CarName;

public class Car {
    private CarName carName;
    private StringBuilder position;
    private int distance;

    public String getName() {
        return this.carName.getCarName();
    }

    public Car(CarName carName) {
        this.carName = carName;
        this.distance = 0;
        this.position = new StringBuilder("");
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (distance > Config.MOVING_STANDARD_NUM) {
            this.distance++;
            this.position.append("-");
        }
    }

    public String getPosition() {
        return this.position.toString();
    }
}
