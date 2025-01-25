package testing_with_junit.migrating_from_junit4_to_junit5.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import testing_with_junit.tags.Customer;
import testing_with_junit.tags.CustomersRepository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Category({IndividualTests.class, RepositoryTests.class})
public class JUnit4CustomersRepositoryTest {
    private String CUSTOMER_NAME = "John Smith";
    private CustomersRepository repository = new CustomersRepository();

    @Test
    public void testNonExistence() {
        boolean exists = repository.contains(CUSTOMER_NAME);

        assertFalse(exists);
    }

    @Test
    public void testCustomerPersistence() {
        repository.persist(new Customer(CUSTOMER_NAME));

        assertTrue(repository.contains("John Smith"));
    }
}
