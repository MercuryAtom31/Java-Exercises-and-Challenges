import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Minimum Element Challenge\n" + "-_".repeat(13));

        int[] returnedUserArray = readIntegers();
        int minimumElementOfArray = findMin(returnedUserArray);
        System.out.println(Arrays.toString(returnedUserArray));
        System.out.println("Minimum value = " + minimumElementOfArray);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of the array");
        int sizeOfArray = scanner.nextInt();

        int[] userArray = new int[sizeOfArray];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Please enter the numbers to be stored in the array");
            userArray[i] = scanner.nextInt();
        }

        return userArray;
    }

    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}