package tasks.fundamentals.optionalTask;

public class RangerArrays {
    private final String[] numbers;

    public RangerArrays(String[] numbers) {
        this.numbers = numbers;
    }

    public void increaseArray() {
        System.out.println("Array of numbers in increase order:");
        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[min].length() > numbers[j].length()) {
                    min = j;
                }
            }
            String temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void decreaseArray() {
        System.out.println("Array of numbers in decrease order:");
        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[min].length() < numbers[j].length()) {
                    min = j;
                }
            }
            String temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
