package racingcar.view;

import racingcar.constant.Message;
import racingcar.model.car.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleView {
    public void inputName() {
        System.out.println(Message.INPUT_NAMES);
    }

    public void inputCount() {
        System.out.println(Message.INPUT_COUNT);
    }

    public void outputRace() {
        System.out.println(Message.OUTPUT_RACE);
    }

    public void outputRaceCars(List<Car> cars) {
        cars.forEach((car -> {
            System.out.println(car.getName() + " : " + car.getPosition());
        }));
        System.out.println();
    }

    public void outputResult(List<Car> winners) {
        String result = winners.stream().map(Car::getName).collect(Collectors.joining(","));
        System.out.println(Message.OUTPUT_RESULT + result);
    }

    public void outputError(String message) {
        System.out.println(message);
    }
}
