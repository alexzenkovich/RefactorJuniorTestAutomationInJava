package tasks.fundamentals.optionalTask;

public class CheckerIncreaseOrder {
    private String[] numbers;

    public CheckerIncreaseOrder(String[] numbers) {
        this.numbers = numbers;
    }

    public int checkNumber (String number) {
        String[] digits = number.trim().split("");
        int x = Integer.parseInt(digits[0]);
        int count = 1;
        for (int i = 1; i < digits.length; i++) {
            int d = Integer.parseInt(digits[i]);
            if (x < d) {
                x = d;
                count++;
            }
        }
        return count;
    }

    public void checkIncreaseOrder () {
        for (String s : numbers) {
            if (checkNumber(s) == s.length()) {
                System.out.println(s);
                return;
            }
        }
    }
}
