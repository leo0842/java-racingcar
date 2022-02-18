package racingcar.model;

public class BiggerNumberMoving implements Moving {

    private final int movableNumber;

    public BiggerNumberMoving(int number) {
        this.movableNumber = number;
    }

    @Override
    public boolean canMove(Integer number) {
        if (number >= movableNumber) {
            return true;
        }
        return false;
    }
}
