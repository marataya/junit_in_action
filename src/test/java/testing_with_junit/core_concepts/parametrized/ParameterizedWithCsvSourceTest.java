package testing_with_junit.core_concepts.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedWithCsvSourceTest {
    private final WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @CsvSource({"2, Unit testing", "3, JUnit in Action", "4, Write solid Java code"})
    void testWordsInSentence(int expected, String sentence) {
        assertEquals(expected, wordCounter.countWords(sentence));
    }
}
