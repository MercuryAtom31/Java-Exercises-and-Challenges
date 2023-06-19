import java.util.Scanner;

public class ReadingUserInputChallenge {

    /*
    In this challenge, you'll read 5 valid numbers from the console,
    entered by the user, and print the sum of those five numbers.

    You'll want to check that the numbers entered, are valid integers.

    If not, print out the message "Invalid number" to the console,
    but continue looping, until you do have 5 valid numbers.

    Before the enters each number, prompt them with the message,
    "Enter number #x:", where x represents the count, 1, 2, 3, etc.

    And as an example there, the first message would look something like,
    "Enter number #1:", the next, "Enter number #2:", and so on.
     */
    public static void main(String[] args) {

        System.out.println("Please, give me five numbers and it will print the sum.");
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        do {
            try {
                System.out.println("Enter number #" + count);
                int userNumberInInt = Integer.parseInt(scanner.nextLine());
                sum += userNumberInInt;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Oups! Please enter a numeric value.");
            }
        } while (count <= 5);
        System.out.println("The sum of the five numbers you've entered = " + sum);
    }
}
    /*
    Instead of writing:

    String userNumberInString = scanner.nextLine();
    int userNumberInInt = Integer.parseInt(userNumberInString);
    sum += userNumberInInt;

    Simply write:

    int userNumber = Integer.parseInt(scanner.nextLine());
    */