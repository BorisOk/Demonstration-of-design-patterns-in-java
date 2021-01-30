package by.boris.structuralPatterns.facade;

import by.boris.structuralPatterns.facade.facadeExample.CarFacade;
import by.boris.structuralPatterns.facade.pats.SystemUnit;
import by.boris.structuralPatterns.facade.pats.Loudspeakers;
import by.boris.structuralPatterns.facade.pats.Monitor;

public class ClientMain {
    public static void main(String[] args) {
        // вариант 1 (с фасад)
        CarFacade carFacade = new CarFacade();
        carFacade.go();

        System.out.println("================================");

        // вариант 2 (без фасада)
        SystemUnit systemUnit = new SystemUnit();
        systemUnit.turnOn();
        Monitor monitor = new Monitor();
        monitor.turnOn();
        Loudspeakers loudspeakers = new Loudspeakers();
        loudspeakers.turnOn();
    }
}
