package testing_with_junit.mocking.account;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test-case to test the AccountService class by means of the Mockito framework.
 */
@ExtendWith(MockitoExtension.class)
public class TestAccountServiceMockito {
    /**
     * The mock instance of the AccountManager to use.
     */
    @Mock
    private AccountManager mockAccountManager;

    @Test
    public void testTransferOk() {
        Account senderAccount = new Account("1", 200);
        Account beneficiaryAccount = new Account("2", 100);

        Mockito.lenient().when(mockAccountManager.findAccountForUser("1")).thenReturn(senderAccount);
        Mockito.lenient().when(mockAccountManager.findAccountForUser("2")).thenReturn(beneficiaryAccount);

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1", "2", 50);

        assertEquals(150, senderAccount.getBalance());
        assertEquals(150, beneficiaryAccount.getBalance());
    }
}
