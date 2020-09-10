package tasks.fundamentals.optionalTask;

public class FinderOfShortOrLongNumber {
    private final String[] numbers;

    public FinderOfShortOrLongNumber (String[] numbers) {
        this.numbers = numbers;
    }

    public void findShortAndLongNumber () {
        int shortNumber = numbers[0].length();
        int longNumber = 0;
        for (String s : numbers) {
            if (s.length() < shortNumber) {
                shortNumber = s.length();
            } else if (s.length() > longNumber) {
                longNumber = s.length();
            }
        }
        for (String s : numbers) {
            if (s.length() == shortNumber) {
                System.out.println("Short number is " + s + ". Its length is " + s.length());
            } else if (s.length() == longNumber) {
                System.out.println("Long number is " + s + ". Its length is " + s.length());
            }
        }
        System.out.println();
    }
}
