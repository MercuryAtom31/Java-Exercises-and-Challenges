public class AllFactors {
    /*
    Write a method named printFactors with one parameter of type int named number.
    If number is < 1, the method should print "Invalid Value".
    The method should print all factors of the number.
    A factor of a number is an integer which divides that number wholly
    (i.e. without leaving a remainder).
    For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder.
    In other words 6 / 3 = 2.

    HINT: Use a while or for loop.

    NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.
    For example, the printout for printFactors(10); can be:
    1
    2
    5
    10
    */
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value, your number is smaller than 1.");
        } else {
            System.out.println("The factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}