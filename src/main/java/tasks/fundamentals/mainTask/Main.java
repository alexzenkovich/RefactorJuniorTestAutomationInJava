package tasks.fundamentals.mainTask;

public class Main {
    public static void main(String[] args) {
        TaskMain tm = new TaskMain();

        tm.printHelloUser();
        System.out.println();
        tm.printArguments("Junior Test Automation Engineer in Java");
        System.out.println();
        tm.printRandomNumbers();
        System.out.println();
        tm.getSumAndProductOfNumbers();
        System.out.println();
        tm.checkMonthOfYear();
    }
}
