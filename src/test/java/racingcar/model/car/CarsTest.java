package racingcar.model.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    @Test
    @DisplayName("입력받아서 ,기준으로 분리하여 자동차 리스트를 생성하고 그 리스트의 사이즈는 3이다.")
    void 자동차이름_입력받아서_자동차_리스트_사이즈3_객체생성() {
        //given
        Cars cars = new Cars();

        //when
        String input = "test1,test2,test3";
        cars.createCarList(input);

        //then
        assertThat(cars.getCars().size()).isEqualTo(3);
    }
}
