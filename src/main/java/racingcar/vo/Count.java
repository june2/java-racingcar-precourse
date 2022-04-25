package racingcar.vo;

import racingcar.constant.Message;

public class Count extends Base {
    private int count;

    public Count(String input) {
        super(input);
    }

    public int getCount() {
        return count;
    }

    @Override
    protected void validate() {
        try {
            this.count = Integer.parseInt(this.input);
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException(Message.ERROR_INVLAID_COUNT);
        }
    }
}
