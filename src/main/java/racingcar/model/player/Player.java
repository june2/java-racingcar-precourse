package racingcar.model.player;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.Config;
import racingcar.constant.Message;

public class Player {
    private String[] carNames;
    private int count;

    private void validateName(String name) {
        if (name.length() > Config.MAX_CAR_NAME) {
            throw new IllegalArgumentException(Message.ERROR_INVLAID_CAR_NAMES);
        }
    }

    private int validateCount(String count) {
        try {
            return Integer.parseInt(count);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException(Message.ERROR_INVLAID_COUNT);
        }
    }

    public String[] getCarNames() {
        return carNames;
    }

    public int getCount() {
        return count;
    }

    public void inputCarNames() {
        String input = Console.readLine();
        this.carNames = input.split(",");
        for (String carName : this.carNames) {
            this.validateName(carName);
        }
    }

    public void inputCount() {
        this.count = this.validateCount(Console.readLine());
    }
}
