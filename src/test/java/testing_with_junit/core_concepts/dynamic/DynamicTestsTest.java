package testing_with_junit.core_concepts.dynamic;

import org.junit.jupiter.api.*;
import testing_with_junit.core_concepts.predicate.PositiveNumberPredicate;

import java.util.Iterator;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsTest {
    private PositiveNumberPredicate predicate = new PositiveNumberPredicate();


    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach method");
    }

    @TestFactory
    Iterator<DynamicTest> positiveNumberPredicateTestCases() {
        return asList(
            dynamicTest("negative number", () -> assertFalse(predicate.check(-1))),
            dynamicTest("zero", () -> assertFalse(predicate.check(0))),
            dynamicTest("positive number", () -> assertTrue(predicate.check(1)))
        ).iterator();
    }
}
