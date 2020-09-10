package tasks.collections.mainTask.wagons;

import tasks.collections.mainTask.ComfortableType;

public class CoupeWagon extends Wagon{

    private final static int MAX_PASSENGERS_IN_COUPE = 4;

    public CoupeWagon(int maxCapacityPassengers, ComfortableType comfortableType,
                      int currentNumberOfPassengers, int currentBaggageWeight) {
        super(maxCapacityPassengers, comfortableType, currentNumberOfPassengers, currentBaggageWeight);
    }


}
