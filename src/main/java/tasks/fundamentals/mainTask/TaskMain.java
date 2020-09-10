package tasks.fundamentals.mainTask;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class TaskMain {

    Scanner scanner = new Scanner(System.in);

    public void printHelloUser () {
        out.println("Enter your name:");
        out.println("Hello, " + scanner.nextLine());
    }

    public void printArguments (String arguments) {
        String[] args = arguments.split(" ");
        for (int i = args.length - 1; i >= 0; i--) {
            out.print(args[i] + " ");
        }
        out.println();
    }

    public void printRandomNumbers () {
        Random random = new Random();
        out.println("Enter number:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100);
        }
        out.println("print numbers with next line:");
        for (int number : numbers) {
            out.println(number);
        }
        out.println("print numbers without next line:");
        for (int number : numbers) {
            out.print(number + " ");
        }
        out.println();
    }

    public void getSumAndProductOfNumbers () {
        out.println("Enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int multiply = a * b;
        out.println("sum of numbers is: " + sum);
        out.println("product of numbers is: " + multiply);
    }

    public void checkMonthOfYear () {
        out.println("Enter a number from 1 to 12:");
        int n = scanner.nextInt();
        while (n < 1 || n > 12) {
            out.println("Number is not correct. Try again.");
            n = scanner.nextInt();
        }
        switch (n) {
            case 1:
                out.println("January");
                break;
            case 2:
                out.println("February");
                break;
            case 3:
                out.println("March");
                break;
            case 4:
                out.println("April");
                break;
            case 5:
                out.println("May");
                break;
            case 6:
                out.println("June");
                break;
            case 7:
                out.println("July");
                break;
            case 8:
                out.println("August");
                break;
            case 9:
                out.println("September");
                break;
            case 10:
                out.println("October");
                break;
            case 11:
                out.println("November");
                break;
            case 12:
                out.println("December");
                break;
        }
    }
}
