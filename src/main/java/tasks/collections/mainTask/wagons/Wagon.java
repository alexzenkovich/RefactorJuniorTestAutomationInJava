package tasks.collections.mainTask.wagons;

import tasks.collections.mainTask.ComfortableType;

import java.util.Objects;

public abstract class Wagon {
    private final int maxCapacityPassengers;
    private final ComfortableType comfortableType;
    private int currentNumberOfPassengers;
    private int currentBaggageWeight;

    public Wagon(int maxCapacityPassengers, ComfortableType comfortableType,
                 int currentNumberOfPassengers, int currentBaggageWeight) {
        this.maxCapacityPassengers = maxCapacityPassengers;
        this.comfortableType = comfortableType;
        this.currentNumberOfPassengers = currentNumberOfPassengers;
        this.currentBaggageWeight = currentBaggageWeight;
    }

    public int getMaxCapacityPassengers() {
        return maxCapacityPassengers;
    }

    public ComfortableType getComfortableType() {
        return comfortableType;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public int getCurrentBaggageWeight() {
        return currentBaggageWeight;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }

    public void setCurrentBaggageWeight(int currentBaggageWeight) {
        this.currentBaggageWeight = currentBaggageWeight;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "maxCapacityPassengers=" + maxCapacityPassengers +
                ", comfortableType=" + comfortableType +
                ", currentNumberOfPassengers=" + currentNumberOfPassengers +
                ", currentBaggageWeight=" + currentBaggageWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagon wagon = (Wagon) o;
        return getMaxCapacityPassengers() == wagon.getMaxCapacityPassengers() &&
                getCurrentNumberOfPassengers() == wagon.getCurrentNumberOfPassengers() &&
                getCurrentBaggageWeight() == wagon.getCurrentBaggageWeight() &&
                getComfortableType() == wagon.getComfortableType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaxCapacityPassengers(), getComfortableType(), getCurrentNumberOfPassengers(),
                getCurrentBaggageWeight());
    }
}
