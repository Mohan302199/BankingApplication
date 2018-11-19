package BankLibrary;

public class SavingsAccount extends Account implements ITest {
    private int minimumBalance;

    public SavingsAccount(String customerName, String customerAddress, String customerMobileNumber, String customerAadharnumber, long currentBalance, String customerPANNumber, int minimumBalance) throws NegativeException, MinBalException {
        super(customerName, customerAddress, customerMobileNumber, customerAadharnumber, currentBalance, customerPANNumber);
        if (minimumBalance < 500) {
            throw new MinBalException("Minimum balance cannot be lessthan 500");
        }
        this.minimumBalance = minimumBalance;
    }

    public void withdraw(int withDrawAmount) throws InSufficientBalnce, NegativeException {
        if (withDrawAmount < 0) {
            throw new NegativeException("Withdraw amountcanot be negative");
        }
        if(super.getCurrentBalance()-minimumBalance>withDrawAmount){
            super.setCurrentBalance(getCurrentBalance()-withDrawAmount);
            System.out.println("Dear Customerr, A withdraw of amount " + withDrawAmount + " has been Successfully done and your current balance is " + this.getCurrentBalance());
        }
        else
            throw new InSufficientBalnce("Sory! Your account does not contain the minimum Balance to withdraw");
    }


    @Override
    public void hi() {
        System.out.println("HI Called");
    }

    @Override
    public void hii(String msg) {
        System.out.println(msg);
    }
}
