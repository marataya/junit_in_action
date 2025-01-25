package testing_with_junit.migrating_from_junit4_to_junit5.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testing_with_junit.tags.Customer;
import testing_with_junit.tags.CustomersRepository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("repository")
public class JUnit5CustomerRepositoryTest {
    private String CUSTOMER_NAME = "John Smith";
    private CustomersRepository repository = new CustomersRepository();

    @Test
    void testNonExistence() {
        boolean exists = repository.contains("John Smith");

        assertFalse(exists);
    }

    @Test
    void testCustomerPersistence() {
        repository.persist(new Customer(CUSTOMER_NAME));

        assertTrue(repository.contains("John Smith"));
    }
}
