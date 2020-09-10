//Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
//Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort()
// из класса Collections.

package tasks.collections.optionalTask;

import java.io.*;
import java.util.*;

public class TextShifter {
    private final List<String> lines = new ArrayList<>();

    public void loadTextFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveTextInReverseOrder(String filename) {
        if (!lines.isEmpty()) {
            try (PrintWriter printWriter = new PrintWriter(new File(filename))) {
                for (int i = lines.size() - 1; i >= 0; i--) {
                    printWriter.write(lines.get(i));
                    printWriter.write("\n");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void sortLinesFromText () {
        lines.sort((Comparator.comparingInt(String::length)));
    }

    public List<String> getLines() {
        return lines;
    }

    public static void main(String[] args) {

        TextShifter textShifter = new TextShifter();
        textShifter.loadTextFromFile("data/textExample.txt");
        textShifter.saveTextInReverseOrder("data/reverseText.txt");
        textShifter.sortLinesFromText();
        for (String s : textShifter.getLines()) {
            System.out.println(s);
       }
    }
}
