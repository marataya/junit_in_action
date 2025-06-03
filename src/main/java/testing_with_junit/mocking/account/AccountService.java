package testing_with_junit.mocking.account;

import org.apache.commons.logging.LogFactory;

public class AccountService {

    private AccountManager accountManager;


    /**
     * A setter method to set the account manager implementation
     *
     * @param manager
     */
    public void setAccountManager(AccountManager manager) {
        this.accountManager = manager;
    }

    /**
     * A transfer method which transfers the amount of money from account with the senderId
     * to the account with the beneficiaryId.
     *
     * @param senderId
     * @param beneficiaryId
     * @param amount
     */
    public void transfer(String senderId, String beneficiaryId, long amount) {
        Account sender = accountManager.findAccountForUser(senderId);
        Account beneficiary = accountManager.findAccountForUser(beneficiaryId);

        sender.debit(amount);
        beneficiary.credit(amount);

        accountManager.updateAccount(sender);
        accountManager.updateAccount(beneficiary);
    }

}
