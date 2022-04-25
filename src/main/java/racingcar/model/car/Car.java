package racingcar.model.car;

public class Car {
    private String name;
    private StringBuilder position = new StringBuilder();
    private int distance;

    public Car(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPosition() {
        for (int i = 0; i < this.distance; i++) {
            this.position.append("-");
        }
        return this.position.toString();
    }
}
