package testing_with_junit.core_concepts.assumptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing_with_junit.core_concepts.assumptions.Job;
import testing_with_junit.core_concepts.assumptions.SUT;
import testing_with_junit.core_concepts.assumptions.environment.JavaSpecification;
import testing_with_junit.core_concepts.assumptions.environment.OperationSystem;
import testing_with_junit.core_concepts.assumptions.environment.TestsEnvironment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumptionsTest {
    private static String EXPECTED_JAVA_VERSION = "21";
    private TestsEnvironment environment = new TestsEnvironment(
            new JavaSpecification(System.getProperty("java.vm.specification.version")),
            new OperationSystem(System.getProperty("os.name"), System.getProperty("os.arch"))
    );

    private SUT systemUnderTest = new SUT();

    @BeforeEach
    void setUp() {
        assumeTrue(environment.isWindows());
    }

    @Test
    void testNoJobToRun() {
        assumingThat(
                () -> environment.getJavaVersion().equals(EXPECTED_JAVA_VERSION),
                () -> assertFalse(systemUnderTest.hasJobToRun()));
    }

    @Test
    void testJobToRun() {
        assumeTrue(environment.isAmd64Architecture());

        systemUnderTest.run(new Job());

        assertTrue(systemUnderTest.hasJobToRun());
    }
}

