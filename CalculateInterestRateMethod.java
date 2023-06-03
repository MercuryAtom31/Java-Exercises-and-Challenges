public class CalculateInterestRateMethod {

    public static void main(String[] args) {

        double amountOfMoney = 220.00;

        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterestRate(amountOfMoney, i);
            System.out.printf("The %.2f at %.2f%% interest rate is: $%.2f\n", amountOfMoney, i, interestAmount);
        }
    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
