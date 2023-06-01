public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }

    public static void areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        /*
        By multiplying the numbers by 1000,
        we shift the decimal places to the right,
        effectively treating the numbers as integers.
        Then, by casting the result to int,
        we discard the fractional part and consider only the whole number.
        This way, we can perform an equality comparison between the scaled numbers
        without being affected by the tiny differences in the decimal places.
        */
        int scaledNumber1 = (int) (firstNumber * 1000);
        int scaledNumber2 = (int) (secondNumber * 1000);
        /*
        It needs to return true if two double numbers are the same
        up to three decimal places.
        Otherwise, return false.
        */
        System.out.println("Are both numbers equal? " +
                (scaledNumber1 == scaledNumber2 ? true : false));
    }
}
