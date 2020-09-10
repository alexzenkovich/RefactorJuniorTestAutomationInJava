package tasks.fundamentals.optionalTask;

public class OptionalTaskOneMain {
    public static void main(String[] args) {
        NumberGenerator op1 = new NumberGenerator();
        op1.createNumbers(5);
        String[] arr = op1.getNumbers();

        FinderOfShortOrLongNumber finderOfNumber = new FinderOfShortOrLongNumber(arr);
        finderOfNumber.findShortAndLongNumber();

        RangerArrays rangerArrays = new RangerArrays(arr);
        rangerArrays.increaseArray();
        rangerArrays.decreaseArray();

        FilterByAverage filterByAverage = new FilterByAverage(arr);
        filterByAverage.printNumbersLessAverage();
        filterByAverage.printNumbersMoreAverage();

        MinimalDifferentDigits minimalDifferentDigits = new MinimalDifferentDigits(arr);
        minimalDifferentDigits.findNumerWithDifferentDigits();

        FinderOddEvenDigits finderOddEvenDigits = new FinderOddEvenDigits(arr);
        finderOddEvenDigits.findOddEvenDigits();

        CheckerIncreaseOrder checkerIncreaseOrder = new CheckerIncreaseOrder(arr);
        checkerIncreaseOrder.checkIncreaseOrder();

        DifferentNumberFinder differentNumberFinder = new DifferentNumberFinder(arr);
        differentNumberFinder.findNumberWithDiffDigits();
    }
}
