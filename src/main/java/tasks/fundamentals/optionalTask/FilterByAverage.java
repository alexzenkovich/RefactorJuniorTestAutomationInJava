package tasks.fundamentals.optionalTask;

public class FilterByAverage {
    private int average;
    private String[] numbers;

    public FilterByAverage (String[] numbers) {
        this.numbers = numbers;
    }

    public int findAverage() {
        int x = 0;
        for (String s : numbers) {
            x += s.length();
        }
        average = x / numbers.length;
        return average;
    }

    public void printNumbersLessAverage () {
        average = findAverage();
        System.out.println("numbers with length less average:");
        for (String s : numbers) {
            if (s.length() < average) {
                System.out.println(s + " " + s.length());
            }
        }
    }

    public void printNumbersMoreAverage () {
        average = findAverage();
        System.out.println("numbers with length more average:");
        for (String s : numbers) {
            if (s.length() > average) {
                System.out.println(s + " " + s.length());
            }
        }
    }

    public int getAverage() {
        return average;
    }
}
