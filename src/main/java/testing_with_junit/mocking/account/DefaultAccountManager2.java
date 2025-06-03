package testing_with_junit.mocking.account;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import testing_with_junit.mocking.configurations.Configuration;
import testing_with_junit.mocking.configurations.DefaultConfiguration;

public class DefaultAccountManager2 implements AccountManager {

    private Log logger;
    private Configuration configuration;

    public DefaultAccountManager2(Log logger, Configuration configuration) {
        this.logger = logger;
        this.configuration = configuration;
    }


    public DefaultAccountManager2() {
        this(LogFactory.getLog(DefaultAccountManager2.class), new DefaultConfiguration("technical"));
    }

    @Override
    public Account findAccountForUser(String userId) {
        logger.debug("Getting account for user [" + userId + "]");
        configuration.getSQL("FIND_ACOUNT_FOR_USER");

        // some logic to load user account using JDBC
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
