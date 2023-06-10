public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(252));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(257));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(0));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(5));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(-10));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(203));
        System.out.println("Sum of the first and last digit = " + sumFirstAndLastDigit(20));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        //Checking if the number is less than zero.
        if (number < 0) {
            return -1;
        } else {
            //Truncating the rightmost (last) digit.
            lastDigit = number % 10;
            //Adding the last digit to the 'sum' variable.
            sum += lastDigit;

            /*
            The following while loop will keep on
            executing the code block that truncates
            the rightmost digit, until there are no
            more digits left.
            Then, the remaining digit, i.e., the first
            digit of the number will be added to the 'sum'
            variable.
             */

            while (number >= 10) {
                number /= 10;  // Remove the last digit
            }
            //Adding the leftover digit (first digit of the original number)
            //to the 'firstDigit' variable.
            firstDigit = number;
            //Adding the digit to the sum.
            sum += firstDigit;

        }
        return sum;
    }
}
