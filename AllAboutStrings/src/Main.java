public class Main {
    public static void main(String[] args) {

        String stringInspectionMethods = """
                String Inspection Methods
                -------------------------""";
        System.out.println(stringInspectionMethods);

        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        /*
        The indexOf() method in Java searches for the first occurrence of a
        specified substring within a string, starting from the left (beginning) of the string.
        It returns the index of the first occurrence or -1 if the substring is not found.

        On the other hand, the lastIndexOf() method searches for the last occurrence
        of a specified substring within a string, starting from the right (end) of the string.
        It returns the index of the last occurrence or -1 if the substring is not found.
        */

        String helloWorld = "Hello World";
        System.out.printf("Index of r= %d %n", helloWorld.indexOf('r'));
        //Returns the index of the first index of the string, namely, 'W'.
        System.out.printf("Index of World= %d %n", helloWorld.indexOf("World"));

        //Returns the index of the FIRST occurrence of the letter 'l' in the string (from left to right).
        System.out.printf("Index of l= %d %n", helloWorld.indexOf('l'));
        //Returns the index of the LAST occurrence of the letter 'l' in the string (from right to left).
        System.out.printf("Index of l= %d %n", helloWorld.lastIndexOf('l'));

        //Returns the index of the FIRST occurrence of the letter 'l' in the string (from left to right),
        //by telling the method from which index to start the search.
        System.out.printf("Index of l= %d %n", helloWorld.indexOf('l', 3));
        //Returns the index of the LAST occurrence of the letter 'l' in the string (from right to left).
        System.out.printf("Index of l= %d %n", helloWorld.lastIndexOf('l', 8));

        String stringComparisonMethods = """
                \nString Comparison Methods
                -------------------------""";
        System.out.println(stringComparisonMethods);

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("Hello")) {
            System.out.println("String ends with Hello");
        }
        if (helloWorld.contains("Hello")) {
            System.out.println("String contains Hello");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

    }

    public static void printInformation(String string) {
        //Creating a variable called length, and setting it to the length method.
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("First char =  %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length -1));

    }
}