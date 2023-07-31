import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Minimum Element Challenge\n" + "-_".repeat(13));

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("Minimum element of the array = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        /*
        * The following line splits the input string into an array of substrings
        * using commas as the delimiter.
        * Each substring between commas will be an element in the splits array.
        *
        * It creates substrings everytime it encounters a comma and it will
        * store each substring inside an array of String. Each substring will be
        * an element of that array.
        */
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            //values[i]: This is an element of the values array.
            //values[i] holds an integer value after parsing the corresponding string splits[i].
            //splits[i]: This is an element of the splits array.
            //splits[i] holds a string value that represents a substring of the original input.
            values[i] = Integer.parseInt(splits[i].trim());
            /*
            The purpose of using trim() is to eliminate any leading or
            trailing white spaces (spaces, tabs, or line breaks) that might be
            present in the substring.
            */
        }
        return values;
    }

    private static int findMin(int[] array) {

        /*
        * int min = Integer.MAX_VALUE;: The min variable is initialized to
        * the maximum possible value for an int (the value of Integer.MAX_VALUE).
        * This ensures that the initial value of min is larger than
        * any value in the array.
        * */
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            //The 'min' variable is being reassigned a new value during the loop.
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}