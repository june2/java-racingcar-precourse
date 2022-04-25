package racingcar.model.game;

public class Game extends GameConfig {
    private boolean isRunning = true;
    private int count = 0;

    private void end() {
        this.isRunning = false;
    }


    private void run() {
        // 게임 시작
        this.view.inputName();

        try {
            this.player.inputCarNames();
        } catch (IllegalArgumentException exception) {
            this.view.outputError(exception.getMessage());
            this.player.inputCarNames();
        }

        this.view.inputCount();
        try {
            this.player.inputCount();
        } catch (IllegalArgumentException exception) {
            this.view.outputError(exception.getMessage());
            this.player.inputCount();
        }

        // race
        cars.createCarList(this.player.getCarNames());
        this.view.outputRace();
        do {
            cars.race();
            this.count++;
            this.view.outputRaceCars(cars.getCars());
        } while (this.player.getCount() != this.count);

        // output
        this.view.outputResult(this.cars.getWinnners());
        this.end();
    }

    public void play() {
        do {
            this.run();
        } while (this.isRunning);
    }
}
