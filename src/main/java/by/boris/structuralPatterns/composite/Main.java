package by.boris.structuralPatterns.composite;
/** Runner class.*/
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Tiler();
        Worker worker2 = new Plasterer();
        Worker worker3 = new Plasterer();

        CrewOfWorkers crewOfWorkers = new CrewOfWorkers();
        crewOfWorkers.addWorker(worker1);
        crewOfWorkers.addWorker(worker2);
        crewOfWorkers.addWorker(worker3);

        crewOfWorkers.apartmentRenovation();
    }
}
