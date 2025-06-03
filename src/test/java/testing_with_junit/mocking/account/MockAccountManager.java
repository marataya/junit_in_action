package testing_with_junit.mocking.account;

import java.util.HashMap;
import java.util.Map;

public class MockAccountManager implements AccountManager {

    private Map<String, Account> accounts = new HashMap<>();

    /**
     * A method to add an account to the manager.
     *
     * @param userId
     * @param account
     */
    public void addAccount(String userId, Account account) {
        accounts.put(userId, account);
    }

    /**
     * A method to find an account for the user with the given ID.
     */
    @Override
    public Account findAccountForUser(String userId) {
        return accounts.get(userId);
    }

    /**
     * A method to update the given account. Notice that we don't need this method and that's why leave it
     * with a blank implementation.
     */
    @Override
    public void updateAccount(Account account) {
        //do nothing
    }
}
