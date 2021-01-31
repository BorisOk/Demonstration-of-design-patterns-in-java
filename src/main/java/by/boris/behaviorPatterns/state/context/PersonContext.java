package by.boris.behaviorPatterns.state.context;
import by.boris.behaviorPatterns.state.state.PersonState;

/** Обьект человек без определенных состояний в обычном состоянии. (null) */
public class PersonContext implements PersonState {

    PersonState state;

    public PersonState getState() {
        return state;
    }

    public void setState(PersonState state) {
        this.state = state;
    }

    @Override
    public void action() {
        this.state.action();
    }
}
