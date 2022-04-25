package racingcar.model.car;

import racingcar.constant.Config;

public class Car {
    private String name;
    private StringBuilder position;
    private int distance;

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
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
