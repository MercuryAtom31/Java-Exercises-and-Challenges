public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println("-1221 is a palindrome. True or false? " + isPalindrome(-1221));
        System.out.println("707 is a palindrome. True or false? " + isPalindrome(707));
        System.out.println("11212 is a palindrome. True or false? " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        //Storing the original number for later comparison.
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            //Extracting the last digit of the number.
            int lastDigit = number % 10;
            //Storing the last digits, at the rightmost position, into the variable.
            reversedNumber = reversedNumber * 10 + lastDigit;
            //Truncating the last digit of the number variable.
            number /= 10;
        }
        //Comparing the original number with the reversed number.
        return originalNumber == reversedNumber;

    }
}
