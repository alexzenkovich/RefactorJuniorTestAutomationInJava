package tasks.collections.mainTask;

import tasks.collections.mainTask.wagons.CoupeWagon;
import tasks.collections.mainTask.wagons.LuxWagon;
import tasks.collections.mainTask.wagons.SecondClassWagon;
import tasks.collections.mainTask.wagons.Wagon;
import java.util.Arrays;
import java.util.List;

public class TrainCreator {
    static List<Wagon> wagons = Arrays.asList(
            new LuxWagon(18, ComfortableType.LUX, 6, 80),
            new CoupeWagon(36, ComfortableType.COUPE, 15, 170),
            new CoupeWagon(36, ComfortableType.COUPE, 21, 230),
            new CoupeWagon(36, ComfortableType.COUPE, 8, 100),
            new SecondClassWagon(54, ComfortableType.SECOND_CLASS, 25, 300),
            new SecondClassWagon(54, ComfortableType.SECOND_CLASS, 45, 500),
            new SecondClassWagon(54, ComfortableType.SECOND_CLASS, 18, 230),
            new SecondClassWagon(54, ComfortableType.SECOND_CLASS, 30, 350),
            new SecondClassWagon(54, ComfortableType.SECOND_CLASS, 35, 400)
    );

    public static void main(String[] args) {
        Train train = new Train(wagons);

        System.out.println("Number of passengers in the train " + train.getTotalNumberOfPassengers() + ".");

        System.out.println("Total baggage weight is " + train.getTotalBaggageWeight() + " kg.");

        train.sortWagonsByComfortable();

        for (Wagon wagon : train.getWagons()) {
            System.out.println(wagon);
        }

        System.out.println(train.getWagonsWithNumberOfPassengers(15, 25));
    }
}
