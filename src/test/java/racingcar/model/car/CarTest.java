package racingcar.model.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @DisplayName("Position은 distance값에 기반하여 '-'문자를 생성하여 반환한다.")
    @ParameterizedTest
    @CsvSource({
            "1, -",
            "2, --",
            "3, ---"
    })
    void getPosition_검증(int distance, String position) {
        //given
        Car car = new Car("Test");

        //when
        car.setDistance(distance);

        //then
        assertThat(car.getPosition()).isEqualTo(position);
    }}
