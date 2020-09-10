package tasks.fundamentals.optionalTask;

import java.util.HashSet;
import java.util.Set;

public class MinimalDifferentDigits {
    private String[] numbers;

    public MinimalDifferentDigits(String[] numbers) {
        this.numbers = numbers;
    }

    public int findDifferentDigits (int number) {
        Set<Integer> hashSet = new HashSet<>();
        while (number > 0) {
            hashSet.add(number%10);
            number /= 10;
        }
        return hashSet.size();
    }

    public void findNumerWithDifferentDigits () {
        int minimum = findDifferentDigits(Integer.parseInt(numbers[0]));
        String minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int temp = Integer.parseInt(numbers[i]);
            if (findDifferentDigits(temp) < minimum) {
                minimum = findDifferentDigits(temp);
                minNumber = numbers[i];
            }
        }
        System.out.println("Number with minimal number of different digits: " + minNumber);
    }
}
