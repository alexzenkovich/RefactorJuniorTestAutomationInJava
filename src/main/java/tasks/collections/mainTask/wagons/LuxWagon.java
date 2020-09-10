package tasks.collections.mainTask.wagons;

import tasks.collections.mainTask.ComfortableType;

public class LuxWagon extends Wagon {

    private final static int MAX_PASSENGERS_IN_SUITE = 2;

    public LuxWagon(int maxCapacityPassengers, ComfortableType comfortableType,
                    int currentNumberOfPassengers, int currentBaggageWeight) {
        super(maxCapacityPassengers, comfortableType, currentNumberOfPassengers, currentBaggageWeight);
    }


}
