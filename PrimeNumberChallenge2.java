public class PrimeNumberChallenge2 {

    public static void main(String[] args) {

        //This counter variable will keep count of how many
        //prime numbers were found.
        int primeNumberCounter = 0;

        for (int i = 10; i <= 50; i++) {

            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                primeNumberCounter++;
                if (primeNumberCounter == 3) {
                    System.out.println("Exiting for loop after finding the first three prime numbers");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {

            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
