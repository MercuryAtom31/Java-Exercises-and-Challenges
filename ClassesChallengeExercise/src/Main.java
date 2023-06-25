public class Main {
    public static void main(String[] args) {
        String text = "Bank Account";
        String underlinedText = text + "\n" + "-".repeat(text.length());
        System.out.println(underlinedText);

        BankAccount account1 = new BankAccount();

//        BankAccount account1 = new BankAccount("12345678", 5689.90, "Hichem A. Benzaïr",
//                "hibenz@hotmail.com", "(450) 666-7676");

//        account1.setCustomerName("Hichem A. Benzaïr");
//        account1.setAccountNumber("12345678");
//        account1.setEmail("hibenz@hotmail.com");
//        account1.setPhoneNumber("450-666-7676");
//        account1.setAccountBalance(5689.90);

        account1.accountInfo();

        //Depositing money.
        account1.depositingFunds(100.00);
        System.out.println("New balance = $" + account1.getAccountBalance());
        //Withdraw money.
        account1.withdrawingFunds(6000.00);

        account1.accountInfo();

        BankAccount account2 = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + account2.getAccountNumber() + "; Name: " + account2.getCustomerName());
    }
}