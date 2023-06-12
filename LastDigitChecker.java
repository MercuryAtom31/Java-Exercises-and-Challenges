public class LastDigitChecker {

    /*
    Write a method named hasSameLastDigit with three parameters of type int.
    Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
    If one of the numbers is not within the range, the method should return false.
    The method should return true if at least two of the numbers share the same rightmost digit;
    otherwise, it should return false.
    */

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(42, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println("\n" + isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 < 10 || number1 > 1000)
                || (number2 < 10 || number2 > 1000)
                || (number3 < 10 || number3 > 1000)) {
            return false;
        }

        int number1RightmostDigit = number1 % 10;
        int number2RightmostDigit = number2 % 10;
        int number3RightmostDigit = number3 % 10;

        if (number1RightmostDigit == number2RightmostDigit
                || number1RightmostDigit == number3RightmostDigit
                || number2RightmostDigit == number3RightmostDigit) {
            return true;
        }
        return false;
    }

    /*
    Write another method named isValid with one parameter of type int.
    The method needs to return true if the number parameter is
    in range of 10(inclusive) - 1000(inclusive), otherwise return false.
    */
    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}