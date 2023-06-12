public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        int sumOfEvenDigits = 0;


        if (number < 0) {
            //Returning -1 to indicate an invalid value.
            return -1;
        }

        while (number > 0) {

            //Extracting the last digit of the number.
            int lastDigitOfNumber = number % 10;
            //Removing the rightmost digit from the number.
            number /= 10;

            if (lastDigitOfNumber % 2 == 0) {
                sumOfEvenDigits += lastDigitOfNumber;
            }
        }
        return sumOfEvenDigits;
    }
}