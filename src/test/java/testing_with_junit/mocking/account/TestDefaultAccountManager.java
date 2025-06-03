package testing_with_junit.mocking.account;

import org.junit.jupiter.api.Test;
import testing_with_junit.mocking.configurations.MockConfiguration;

class TestDefaultAccountManager {

    @Test
    public void testFindAccountByUser() {
        MockLog logger = new MockLog();

        MockConfiguration configuration = new MockConfiguration();
        configuration.setSQL("SELECT * [...]");
        DefaultAccountManager2 am = new DefaultAccountManager2(logger, configuration);

        Account account = am.findAccountForUser("1234");

        // Asserts here
    }
}