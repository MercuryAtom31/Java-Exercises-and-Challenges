public class LargestPrime {
    /*
    Largest Prime
    Write a method named getLargestPrime with one parameter of type int named number.
    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

    The method should calculate the largest prime factor of a given number and return it.

    EXAMPLE INPUT/OUTPUT:
    getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    getLargestPrime (-1); should return -1 since the parameter is negative

    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
    */
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        //Starting with the smallest prime number (2).
        int largestPrimeFactor = 2;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                /*
                Updating the largestPrimeFactor variable whenever we find a new prime factor
                that is greater than the previous one.
                */
                largestPrimeFactor = i;
                number /= i;
            }
        }

        if (number > 1) {
            largestPrimeFactor = number;
        }
        return largestPrimeFactor;
    }
}

    /*
    -Why do we need the square root of the number?
    -Why do we divide the number by i? number /= i;
    -Why do we check if number is > than 1? (on line 45).
    */