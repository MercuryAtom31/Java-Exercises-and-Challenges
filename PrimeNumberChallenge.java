public class PrimeNumberChallenge {

    public static void main(String[] args) {

        System.out.println("0 is " + ((isPrime(0)) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + ((isPrime(1)) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + ((isPrime(2)) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + ((isPrime(3)) ? "" : "NOT ") + "a prime number");

        System.out.println("\n8 is " + ((isPrime(8)) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + ((isPrime(17)) ? "" : "NOT ") + "a prime number");
    }

    public static boolean isPrime(int wholeNumber) {

        //Checks if the number is less than 2 because 1, 0 or negative numbers are not prime numbers.
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        /*
        This range of divisors is sufficient
        because if wholeNumber is not divisible by any number up to its half,
        it will not be divisible by any number greater than its half either.
        It helps to optimize the computation and avoid unnecessary checks
        beyond the half of the number.
        */
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            /*
            If the remainder of the division (wholeNumber % divisor)
            is equal to 0, it means wholeNumber is divisible by divisor.
            This indicates that wholeNumber is not a prime number
            because it has a divisor other than 1 and itself.
             */
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
