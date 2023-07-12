public class StringMethods {

    public static void main(String[] args) {
        String stringComparisonMethods = """
                \nString Manipulation Methods
                ---------------------------""";
        System.out.println(stringComparisonMethods);

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("\nnewDate using 'join()' = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate concatenated using 'concat()' = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate using 'plus operator' = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/")
                .concat("1982");
        System.out.println("newDate using the method chaining = " + newDate);

        System.out.println("\nReplacing the '/' with '-' = " + newDate.replace('/', '-'));
        System.out.println("Replacing the '2' with '00' = " + newDate.replace("2", "00"));
        //Replacing the first instance of the /.
        System.out.println("Replacing the '/' with '-' = " + newDate.replaceFirst("/", "-"));
        System.out.println("Replacing the '/' with '---' = " + newDate.replaceAll("/", "---"));

        System.out.println("\nABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("\nABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
