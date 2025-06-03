package testing_with_junit.mocking.account;

public interface AccountManager {
    /**
     * A method to find an account by the given userId
     *
     * @param userId
     */
    Account findAccountForUser(String userId);

    /**
     * A method to update an account
     *
     * @param account
     */
    void updateAccount(Account account);


}
