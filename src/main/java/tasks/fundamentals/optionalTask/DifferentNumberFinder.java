package tasks.fundamentals.optionalTask;

public class DifferentNumberFinder {
    private String[] numbers;

    public DifferentNumberFinder(String[] numbers) {
        this.numbers = numbers;
    }

    public boolean checkNumber (String[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int a = Integer.parseInt(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                int b = Integer.parseInt(array[j]);
                if (a == b) {
                    return false;
                }
            }
        }
        return true;
    }

    public void findNumberWithDiffDigits () {
        for (String s : numbers) {
            String[] digits = s.trim().split("");
            if (checkNumber(digits)) {
                System.out.println(s);
                return;
            }
        }
    }
}
