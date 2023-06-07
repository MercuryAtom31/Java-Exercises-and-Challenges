public class DigitSumChallenge {

    public static void main(String[] args) {

        int returnedSum1 = sumDigits(12345);
        System.out.println("Sum of parsed out number is = " + returnedSum1);

        int returnedSum2 = sumDigits(1000);
        System.out.println("Sum of parsed out number is = " + returnedSum2);

        int negativeNumber = sumDigits(-111);
        System.out.println("Negative number entered " + negativeNumber);

        int singleDigit = sumDigits(7);
        System.out.println("Single digit = " + singleDigit);

    }

    public static int sumDigits(int number) {

        int sum = 0;

        if (number < 0) {
            System.out.println("Invalid number");
            return -1;
        }

        if ((number >= 0) && (number <= 9)) {
            return number;
        }

        while (number > 9) {
            //Extracting the rightmost digit (least significant).
            int digit = number % 10;
            //Adding the rightmost digit (least significant) to the sum.
            sum += digit;

//            //Extracting and adding the rightmost digit to the sum variable.
//            sum += (number % 10);
            /*
            Removing the rightmost digit.
            Dividing an integer by 10, has the effect of truncating the number,
            cutting the rightmost (least significant) digit off.
            */
            number /= 10;
        }
        //sum += number;
        return sum;
    }
}
