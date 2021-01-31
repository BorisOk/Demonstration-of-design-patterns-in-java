package by.boris.behaviorPatterns.state.state;
/** Состояние ходьбы. */
public class GoesState implements PersonState {
    @Override
    public void action() {
        System.out.println("Идет...");
    }
}
