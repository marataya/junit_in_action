package testing_with_junit.mocking.account;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import testing_with_junit.mocking.configurations.Configuration;

import static org.mockito.Mockito.when;

/**
 * This is another test-case for the DefaultAccountManager class. We use here the Mockito library to mock the logger and
 * the configuration.
 */
@ExtendWith(MockitoExtension.class)
public class TestDefaultAccountManagerMockito {

    @Mock
    private Configuration configuration;

    @Mock
    private Log logger;


    @Test
    public void testFindAccountByUser() {
        when(configuration.getSQL("FIND_ACCOUNT_FOR_USER")).thenReturn("Getting account for user [1234]");

//        context.checking( new Expectations()
//        {
//            {
//                oneOf (logger).debug("Getting account for user [1234]");
//
//                oneOf (configuration).getSQL( "FIND_ACCOUNT_FOR_USER" );
//                will( returnValue( "SELECT ..." ) );
//            }
//        } );

        DefaultAccountManager2 am = new DefaultAccountManager2(logger, configuration);
        @SuppressWarnings("unused")
        Account account = am.findAccountForUser("1234");

        // Perform asserts here
    }
}
