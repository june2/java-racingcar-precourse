package racingcar.model.game;

public class Game {
    private boolean isRunning = true;

    private void end() {
        this.isRunning = false;
    }

    public void play() {
        do {
//            this.run();
        } while (this.isRunning);
    }
}
