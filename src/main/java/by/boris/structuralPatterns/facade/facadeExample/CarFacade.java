package by.boris.structuralPatterns.facade.facadeExample;

import by.boris.structuralPatterns.facade.pats.SystemUnit;
import by.boris.structuralPatterns.facade.pats.Loudspeakers;
import by.boris.structuralPatterns.facade.pats.Monitor;

/** Класс фасад. В нем выполняются все действия для того что б компьютер включился. Скрытно от пользователя.
    Что бы пользователю не пришлось проходить все процедуры поэтапно. Но если он хочет он может сделать
    все поэтапно. С испол. фасада (вариант 1) в классе ClientMain, дез использования (вариант 2)*/
public class CarFacade {
    private final SystemUnit systemUnit;
    private final Monitor monitor;
    private final Loudspeakers loudspeakers;

    public CarFacade() {
        systemUnit = new SystemUnit();
        monitor = new Monitor();
        loudspeakers = new Loudspeakers();
    }

    public void go(){
        systemUnit.turnOn();
        monitor.turnOn();
        loudspeakers.turnOn();
    }
}
