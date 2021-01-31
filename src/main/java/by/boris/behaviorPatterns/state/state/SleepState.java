package by.boris.behaviorPatterns.state.state;
/** Состояние сна */
public class SleepState implements PersonState {
    @Override
    public void action() {
        System.out.println("Спит...");
    }
}
