package racingcar.model.player;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.Message;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerTest {
    @Test
    @DisplayName("Player test1,test2,test3 입력시 배열 길이는 3이다.")
    void Player_차동자이름_입력_검증() {
        //given
        Player player = new Player();

        //when
        String input = "test1,test2,test3";
        player.inputCarNames(input);

        //then
        assertThat(player.getCarNames().length).isEqualTo(3);
    }

    @Test
    @DisplayName("Player 자동차이름이 5자이상일시, 에러를 던진다.")
    void Player_차동자이름_입력에러_검증() {
        //given
        Player player = new Player();

        //when
        String input = "test111,test2,test3";

        //then
        assertThrows(IllegalArgumentException.class, () ->
                player.inputCarNames(input), Message.ERROR_INVLAID_CAR_NAMES);
    }

    @Test
    @DisplayName("Player 시도회수 5입력시, count 값은 5이다.")
    void Player_시도횟수_입력_검증() {
        //given
        Player player = new Player();

        //when
        String input = "5";
        player.inputCount(input);

        //then
        assertThat(player.getCount()).isEqualTo(5);
    }

    @Test
    @DisplayName("Player 시도회수에 숫자가 아닌 값을 입력시 에러를 던진다.")
    void Player_시도횟수_입력에러_검증() {
        //given
        Player player = new Player();

        //when
        String input = "5aa";

        //then
        assertThrows(IllegalArgumentException.class, () ->
                player.inputCount(input), Message.ERROR_INVLAID_COUNT);
    }
}
