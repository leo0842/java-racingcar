package racingcar.model;

public class PlayTime {

    private static final int MIN_PLAY_TIME = 1;
    private static final String MIN_PLAY_TIME_ERROR_MESSAGE = "[ERROR] 레이싱 횟수는 1회 이상이어야 합니다.";

    private Integer playTime;

    public PlayTime(Integer playTime) {
        if (playTime < MIN_PLAY_TIME) {
            throw new IllegalArgumentException(MIN_PLAY_TIME_ERROR_MESSAGE);
        }
        this.playTime = playTime;
    }

    public void decrease() {
        this.playTime--;
    }

    public boolean isEnd() {
        return playTime == 0;
    }
}
