public class SharedDigit {
    /*
    Shared Digit
    Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    If one of the numbers is not within the range, the method should return false.
    The method should return true if there is a digit that appears in both numbers,
    such as 2 in 12 and 23; otherwise, the method should return false.

    EXAMPLE INPUT/OUTPUT:
    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
    */
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            while (num1 > 0) {
                //Variable holding the rightmost digit of num1.
                int digit1 = num1 % 10;
                //Variable (temporary) holding the value of num2.
                int temporaryNum2 = num2;
                while (temporaryNum2 > 0) {
                    int digit2 = temporaryNum2 % 10;

                    if (digit1 == digit2) {
                        return true;
                    }
                    temporaryNum2 /= 10;
                }
                num1 /= 10;
            }
        }
        return false;
    }
}