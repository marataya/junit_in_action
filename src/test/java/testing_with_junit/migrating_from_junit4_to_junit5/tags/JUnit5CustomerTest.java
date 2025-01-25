package testing_with_junit.migrating_from_junit4_to_junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testing_with_junit.tags.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("individual")
public class JUnit5CustomerTest {
    private String CUSTOMER_NAME = "John Smith";

    @Test
    void testCustomer() {
        Customer customer = new Customer(CUSTOMER_NAME);

        assertEquals("John Smith", customer.getName());
    }
}
