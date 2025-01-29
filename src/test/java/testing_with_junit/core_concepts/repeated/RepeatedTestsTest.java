package testing_with_junit.core_concepts.repeated;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTestsTest {
    private static Set<Integer> integerSet = new HashSet<>();
    private static List<Integer> integerList = new ArrayList<>();


    @RepeatedTest(value = 5, name = "{displayName} - repitition {currentRepetition}/{totalRepitions}")
    @DisplayName("Test add operation")
    void testAddNumber() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");

    }

    @RepeatedTest(value = 5, name = "the list containst {currentRepetition} elements, the set contains 1 element")
    @DisplayName("Test add operation")
    void testAddingToCollections(TestReporter testReporter, RepetitionInfo repetitionInfo) {
        integerSet.add(1);
        integerList.add(repetitionInfo.getCurrentRepetition());

        testReporter.publishEntry("Repetition number", String.valueOf(repetitionInfo.getCurrentRepetition()));
        assertEquals(1, integerSet.size());
        assertEquals(repetitionInfo.getCurrentRepetition(), integerList.size());
    }
}
