package racingcar.model.car;

public class LongestDistance {
    private int distance;

    public LongestDistance() {
        this.distance = 0;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (this.distance < distance) {
            this.distance = distance;
        }
    }
}
