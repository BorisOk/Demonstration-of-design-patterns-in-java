package by.boris.behaviorPatterns.state.state;
/** Состояние отдыха стоя. */
public class StandState implements PersonState {
    @Override
    public void action() {
        System.out.println("Стоит...");
    }
}
