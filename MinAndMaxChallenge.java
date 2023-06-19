import java.util.Scanner;

public class MinAndMaxChallenge {
    /*
    Min and Max Challenge

    You'll be using an endless loop which:
        -Prompts the user to enter a number, or any character to quit.
        -Validates if the user-entered data really is a number, you can choose either
         an integer, or double validation method.
        -If the user-entered data is not a number, quit the loop.
        -Keep track of the minimum number entered.
        -Keep track of the maximum number entered.
    If the user has previously entered a set of numbers (or even just one),
    display the minimum, and maximum number, which the user entered.
    */
    public static void main(String[] args) {

        System.out.println("Min and Max Challenge");
        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;

        while (true) {
            int userInput;
            System.out.println("Please enter a number or any character to quit");
            try{
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException badUserData){
                break;
            }
            if (userInput > maxNumber){
                maxNumber = userInput;
            }
            if (userInput < minNumber) {
                minNumber = userInput;
            }
        }
        System.out.println("The minimum number is : " + minNumber);
        System.out.println("The maximum number is : " + maxNumber);

    }
}                /*
                The Math.min(a, b) method returns the smaller of the two values a and b.
                So, in the context of tracking the minimum number,
                Math.min(min, number) compares the current minimum value stored
                in the variable min with the number entered by the user.
                It returns the smaller value, which is then assigned back to min.
                In this way, min always holds the smallest number encountered so fa
                */