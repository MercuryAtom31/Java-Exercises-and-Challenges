import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String reverseArrayString = """
                Reverse Array Exercise
                ----------------------""";
        System.out.println(reverseArrayString);

        reverse(new int[] {1, 2, 43, 423, 432, 6563, 7, 867, 393993});
    }

    private static void reverse(int[] array) {
        //Printing the initial array.
        System.out.println("BEFORE reverse: \n" + Arrays.toString(array) + "\n");
        //This line calculates the index of the last element in the array and
        // assigns it to the variable maxIndex.
        int maxIndex = array.length - 1;
        /*
         * This line calculates the "half length" of the array and
         * assigns it to the variable halfLength.
         * */
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            /* * This line temporarily stores the value of the element at index i in
             * the variable temp.
             * */
            int temp = array[i];
            /*
            This line swaps the element at index i with the element at the
            corresponding index from the end (calculated as maxIndex - i).
            For example, if i is 0 and maxIndex is 4 (for an array of length 5),
            it will swap array[0] with array[4], effectively reversing the order
            of the first and last elements.
             */
            array[i] = array[maxIndex - i];
            /*
            Finally, this line places the temporarily stored value (temp) into
            the element that was previously at the corresponding index from the end.
            This completes the swap, effectively reversing the elements.
             */
            array[maxIndex - i] = temp;
            System.out.println("DURING Reversing process " + Arrays.toString(array));
        }
        System.out.println("\nAFTER Reverse \n" + Arrays.toString(array));
    }

}