//Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв,
// считать одинаковыми. Использовать класс HashSet.

package tasks.collections.optionalTask;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SeparatorDifferentWords {
    private final Set<String> wordsSet = new HashSet<>();

    public void searchDifferentWords (String filename) {
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("\\p{Punct}", "");
                if (!equalsWords(word)) {
                    wordsSet.add(word);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean equalsWords (String word) {
        for (String s : wordsSet) {
            if(s.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> getWordsSet() {
        return wordsSet;
    }

    public static void main(String[] args) {
        SeparatorDifferentWords separatorDifferentWords = new SeparatorDifferentWords();

        separatorDifferentWords.searchDifferentWords("data/englishText.txt");

    }
}
