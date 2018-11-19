package BankLibrary;

public abstract class Account {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerMobileNumber;
    private String customerAadharnumber;
    private String customerPANNumber;
    private long currentBalance;
    static int count = 1;
    public Account(){
        this.customerId=count++;
    }

    public Account(String customerName, String customerAddress, String customerMobileNumber, String customerAadharnumber, long currentBalance, String customerPANNumber) throws NegativeException {
        this();
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerMobileNumber = customerMobileNumber;
        this.customerAadharnumber = customerAadharnumber;
        if (currentBalance < 0) {
            throw new NegativeException("Account Balance canot be negative");
        } else {
            this.currentBalance = currentBalance;
        }
        this.customerPANNumber =customerPANNumber;
    }

    public String getCustomerPANNumber() {
        return customerPANNumber;
    }

    public void setCustomerPANNumber(String customerPANNumber) {
        this.customerPANNumber = customerPANNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public String getCustomerAadharnumber() {
        return customerAadharnumber;
    }

    public void setCustomerAadharnumber(String customerAadharnumber) {
        this.customerAadharnumber = customerAadharnumber;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void display(){
        System.out.println(
                "\t\t\t\tWelcome to Bank of SVM.\n"+
                        "\nCustomer Id             : " + this.customerId+
                        "\nCustomer Name           : "+ this.customerName+
                        "\nCustomer Address        : "+this.customerAddress+
                        "\nCustomer Contact Number : "+ this.customerMobileNumber+
                        "\nCustomer PAN Number     : "+this.customerPANNumber+
                        "\nCustomer AADHAR Number  : "+this.customerAadharnumber+
                        "\nCurent Balance          : "+this.currentBalance

        );
    }

    public void withdraw(int withDrawAmount) throws InSufficientBalnce {
        if(this.currentBalance>withDrawAmount){
            this.currentBalance-=withDrawAmount;
            System.out.println("Dear Customer, A withdraw of amount "+withDrawAmount+" has been Successfully done and your current balance is "+this.currentBalance);
            }
            else
            System.out.println("Dear Customer, Your Account Dosent carry Sufficiant balance to do this transaction");
    }

    public void deposit(int depositAmount) throws NegativeException {
        if (depositAmount < 0) {
            throw new NegativeException("Deposit amount cannot be Negative");
        }
        this.currentBalance+=depositAmount;
        System.out.println("Dear Customer a deposit of amount "+ depositAmount+" has been done and your curent balance is"+this.currentBalance);
    }

}
