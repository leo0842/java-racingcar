package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;
    @BeforeEach
    public void setUp() {
        car = new Car("Thor");
    }
    @Test
    public void move() {
        car.tryMove(5);
        assertThat(car.getCarPosition()).isEqualTo(1);
    }

    @Test
    public void doNotMove() {
        car.tryMove(3);
        assertThat(car.getCarPosition()).isEqualTo(0);
    }

    @Test
    public void shouldBeWinner() {
        car.tryMove(5);
        assertThat(car.isWinnerPosition(1)).isEqualTo(true);
    }

    @Test
    public void shouldNotBeWinner() {
        car.tryMove(3);
        assertThat(car.isWinnerPosition(1)).isEqualTo(false);
    }
}