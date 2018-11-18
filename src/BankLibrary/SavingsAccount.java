package BankLibrary;

public class SavingsAccount extends Account {
    private int minimumBalance =500;

    public SavingsAccount(String customerName, String customerAddress, String customerMobileNumber, String customerAadharnumber, long currentBalance, String customerPANNumber) {
        super(customerName, customerAddress, customerMobileNumber, customerAadharnumber, currentBalance, customerPANNumber);
    }
    public void withdraw(int withDrawAmount){
        if(super.getCurrentBalance()-minimumBalance>withDrawAmount){
            super.setCurrentBalance(getCurrentBalance()-withDrawAmount);
            System.out.println("Dear Customer, A withdraw of amount "+withDrawAmount+" has been Successfully done and your current balance is "+this.getCurrentBalance());
        }
        else
            System.out.println("Dear Customer, Your Account Dosent carry Sufficiant balance to do this transaction");
    }


}
