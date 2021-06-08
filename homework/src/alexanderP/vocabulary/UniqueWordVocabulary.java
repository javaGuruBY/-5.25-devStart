package homework.alexanderP.vocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private static Set<String> vocabulary = new HashSet<>();
    public static void main(String[] args) {

        addWord("1");
        addWord("1");
        addWord("2");
        addWord("3");
        System.out.println("Количество слов - " + getWordsCount());
        System.out.println("Вывод всей коллекции- ");
        printVocabulary();

    }

    static void addWord(String word) {
        vocabulary.add(word);
    }

    static int getWordsCount() {
        return vocabulary.size();
    }

    static void printVocabulary() {
        System.out.println(vocabulary);
    }
}
