package tasks.collections.mainTask;

import tasks.collections.mainTask.wagons.Wagon;

import java.util.*;

public class Train {
    private final List<? extends Wagon> wagons;

    public Train(List<? extends Wagon> wagons) {
        this.wagons = wagons;
    }

    public int getTotalNumberOfPassengers () {
        return wagons.stream().mapToInt(Wagon::getCurrentNumberOfPassengers).sum();
    }

    public int getTotalBaggageWeight () {
        return wagons.stream().mapToInt(Wagon::getCurrentBaggageWeight).sum();
    }

    public void sortWagonsByComfortable () {
        wagons.sort(Comparator.comparing(Wagon::getComfortableType));
    }

    public List<? extends Wagon> getWagonsWithNumberOfPassengers (int start, int end) {
        List<Wagon> selectedWagons = new ArrayList<>();
        for (Wagon wagon : wagons) {
            if (wagon.getCurrentNumberOfPassengers() >= start && wagon.getCurrentNumberOfPassengers() <=end) {
                selectedWagons.add(wagon);
            }
        }
        return selectedWagons;
    }

    public List<? extends Wagon> getWagons() {
        return wagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "wagons=" + wagons +
                '}';
    }
}
