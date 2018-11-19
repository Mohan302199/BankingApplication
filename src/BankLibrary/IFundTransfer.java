package BankLibrary;

import BankLibrary.Account;

public interface IFundTransfer {
    public void fundTransfer(Account sourceAccount, Account destinationAccount, int amount) throws NegativeException, InSufficientBalnce;
}
