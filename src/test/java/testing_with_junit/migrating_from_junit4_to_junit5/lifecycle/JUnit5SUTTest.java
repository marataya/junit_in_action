package testing_with_junit.migrating_from_junit4_to_junit5.lifecycle;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5SUTTest {
    private static ResourceForAllTests resourceForAllTests;
    private SUT systemUnderTest;

    @BeforeAll
    public static void setUpClass() {
        resourceForAllTests = new ResourceForAllTests("Resource for all tests");
    }

    @AfterAll
    static void tearDownClass() {
        resourceForAllTests.close();
    }

    @BeforeEach
    public void setUp() {
        systemUnderTest = new SUT("Our system under test");
    }

    @AfterEach
    public void tearDown() {
        systemUnderTest.close();
    }

    @Test
    public void testRegularWork() {
        boolean canReceiveRegularWork = systemUnderTest.canReceiveRegularWork();
        assertTrue(systemUnderTest.canReceiveRegularWork());
    }

    @Test
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork = systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }

    @Test
    @Disabled
    public void myThirdTest() {
        assertEquals("2 is not equal to to 1", 2, 1);
    }



}
