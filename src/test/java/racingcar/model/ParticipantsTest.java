package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipantsTest {

    private Participants participants;
    @BeforeEach
    public void setUp() {
        this.participants = new Participants();
        participants.participateInRacing(new Car("Eden"));
        participants.participateInRacing(new Car("Thor"));
    }

    @Test
    public void participateInRacing() {
        assertThat(participants.participateSize()).isEqualTo(2);
    }

    @Test
    public void cannotModifyWhenGetParticipantsCars() {
        List<Car> participantCars = participants.getParticipantCars();
        assertThatThrownBy(() ->  participantCars.add(new Car("Pobi")))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    public void race() {
    }
}