package by.boris.behaviorPatterns.state;

import by.boris.behaviorPatterns.state.context.PersonContext;
import by.boris.behaviorPatterns.state.state.GoesState;
import by.boris.behaviorPatterns.state.state.SleepState;
import by.boris.behaviorPatterns.state.state.StandState;
/** Runner class. */
public class Main {
    public static void main(String[] args) {
        // создаем просто трансформера в котором будем менять состояния
        PersonContext personContext = new PersonContext();

        // меняем его обычное состояние на состояние ходьбы
        personContext.setState(new GoesState());
        personContext.action(); // идет

        // меняем его состояние ходьбы на состояние отдых стоя
        personContext.setState(new StandState());
        personContext.action(); // стоит

        // меняем его состояние отдыха стоя на состояние сна
        personContext.setState(new SleepState());
        personContext.action(); // спит
    }
}
