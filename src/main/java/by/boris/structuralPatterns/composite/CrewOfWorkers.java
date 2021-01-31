package by.boris.structuralPatterns.composite;
import java.util.ArrayList;
import java.util.List;
/** Класс бригада рабочих. */
public class CrewOfWorkers {
    List<Worker> workerList = new ArrayList<>();

    public void addWorker(Worker worker) {
        workerList.add(worker);
    }

    public void removeWorker(Worker worker) {
        workerList.remove(worker);
    }

    public void apartmentRenovation() {
        System.out.println("Начался ремонт. Приступили к работе: \n");
        workerList.forEach(Worker::does);
    }
}
