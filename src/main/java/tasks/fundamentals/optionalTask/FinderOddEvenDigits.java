package tasks.fundamentals.optionalTask;

public class FinderOddEvenDigits {
    private final String[] numbers;

    public FinderOddEvenDigits (String[] numbers) {
        this.numbers = numbers;
    }

    public int findEvenDigits (String number) {
        String[] digits = number.trim().split("");
        int count = 0;
        for (String s : digits) {
            int temp = Integer.parseInt(s);
            if (temp % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public void findOddEvenDigits () {
        int oddAndEvenDigits = 0;
        int evenDigits = 0;
        for (String s : numbers) {
            int x = findEvenDigits(s);
            if (x == s.length()) {
                evenDigits++;
            }
            if (s.length()%2 == 0 && x == s.length()/2) {
                oddAndEvenDigits++;
            }
        }
        System.out.println("Numbers contain only even digits are " + evenDigits);
        System.out.println("Numbers contain half even and half odd digits are " + oddAndEvenDigits);
    }
}
