import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //2nd way to do the challenge.
//        System.out.println("-".repeat(18) + "\nArrays Challenge 1\n" + "-".repeat(18));
//        System.out.println("\nSorting an array of integers in descending order\n" + "-".repeat(48));
//
//        int[] newArray = randomlyGeneratedIntegers(5);
//        System.out.println("Array AFTER sorting\n" + Arrays.toString(newArray));

        //1st way to do the challenge**************************
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

    }
    //1st way to do the challenge**************************
    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));

        }
        return sortedArray;
    }


    //2nd way to do the challenge.

//    private static int[] randomlyGeneratedIntegers(int chosenLengthOfArray) {
//
//        Random random = new Random();
//        int[] randomArray = new int[chosenLengthOfArray];
//
//        for (int i = 0; i < chosenLengthOfArray; i++) {
//            randomArray[i] = random.nextInt(1000);
//            randomArray[i] *= -1;
//        }
//        System.out.println("Array BEFORE sorting\n" + Arrays.toString(randomArray));
//
//        Arrays.sort(randomArray);
//
//        for (int i = 0; i < chosenLengthOfArray; i++) {
//            randomArray[i] *= -1;
//        }
//        return randomArray;
//    }
}