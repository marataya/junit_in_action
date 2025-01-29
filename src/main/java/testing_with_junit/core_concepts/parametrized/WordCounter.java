package testing_with_junit.core_concepts.parametrized;

public class WordCounter {
    public int countWords(String sentence) {
        return sentence.split(" ").length;
    }
}
