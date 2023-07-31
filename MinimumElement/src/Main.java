import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String minimumString = """
                Minimum Element Exercise
                -_-_-_-_-_-_-_-_-_-_-_-_""";
        System.out.println(minimumString);

        int userChosenNumberOfElement = readInteger();
        int[] array1 = readElements(userChosenNumberOfElement);
        System.out.println("Integer values entered by user: \n" + Arrays.toString(array1));

        int minimum = findMin(array1);
        System.out.println("The minimum value in the array = " + minimum);
    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of integers you want to enter");
        int numberOfIntegersEnteredByUser = scanner.nextInt();

        return numberOfIntegersEnteredByUser;
    }

    private static int[] readElements(int sizeOfArray) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayStoringUserIntegerValues = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Please enter integer values to be stored inside an array");
            arrayStoringUserIntegerValues[i] = scanner.nextInt();
        }
        return arrayStoringUserIntegerValues;
    }

    private static int findMin(int[] array) {
        //Sorting the array in the default sort() method's ascending order.
        Arrays.sort(array);
        /*
        Returning the first element of the array. Thanks to the sort() method,
        the first element will be the smallest number in the array.
        */
        return array[0];
    }
}