package testing_with_junit.migrating_from_junit4_to_junit5.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import testing_with_junit.tags.Customer;

import static org.junit.Assert.assertEquals;

public class JUnit4CustomerTest {
    private String CUSTOMER_NAME = "John Smith";

    @Category(IndividualTests.class)
    @Test
    public void testCustomer() {
        Customer customer = new Customer(CUSTOMER_NAME);

        assertEquals("John Smith", customer.getName());
    }
}
