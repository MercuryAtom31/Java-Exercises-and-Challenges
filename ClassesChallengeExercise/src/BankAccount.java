public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }
    //No-args (no argument) Constructor.
    public BankAccount(){
        /*
        Constructor chaining. Calling a constructor within another constructor.

        The following code that uses the "this();" keyword is calling another constructor
        (the constructor with arguments) within this no-args constructor.
        It essentially says: if you try to create an object from the class (BankAccount)
        and you don't give it any parameters, set this new object up with the values inside
        this(...); by calling the other constructor (the constructor with arguments).

        IMPORTANT: the "this(...);" must be the first line of the code.
        */
        this("56789", 2.50, "Default Name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }
    //Constructor with arguments.
    public BankAccount(String number, double balance, String customerName, String email,
                       String phone){
        System.out.println("Account constructor with parameters called");
        accountNumber = number;
        accountBalance = balance;
        this.customerName = customerName;
        customerEmail = email;
        phoneNumber = phone;
    }

    //Constructor with three fields.
    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 100.55, customerName, customerEmail, phoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double depositAmount) {
//        return this.accountBalance += depositAmount;
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
                accountBalance);
    }

    public void withdrawingFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Sorry, your withdrawal request cannot be processed " +
                    "as it would result in a negative account balance. Please enter a different amount or contact customer support " +
                    "for assistance.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, " +
                    "remaining balance = $" + accountBalance);
        }
    }

    public void accountInfo(){
        System.out.println("Customer name: " + customerName + "\nAccount number: "
                + accountNumber + "\nEmail: " + customerEmail
                + "\nPhone number: " + phoneNumber + "\nBalance: $" + accountBalance);

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String email) {
        this.customerEmail = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
