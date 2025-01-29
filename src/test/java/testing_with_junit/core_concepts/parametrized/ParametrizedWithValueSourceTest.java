package testing_with_junit.core_concepts.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParametrizedWithValueSourceTest {

    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @ValueSource(strings={"Check three parameters", "JUnit in Action"})
    void testWordsInSentence(String sentence) {
        assertEquals(3, wordCounter.countWords(sentence));
    }
}
