public class Main {
    public static void main(String[] args) {
        System.out.println("String Formatting\n");

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        /*
        The text block lets us format text in the source code,
        the same way we want to see it in the output.
        */
        String textBlock = """
                    Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point """;
        System.out.println(textBlock);

        /*
        Printf() is like print(), in that it doesn't end with a newline character.

        It has multiple arguments, the  first is a String which will be printed to
        the console, and the following arguments  are values,
        that'll be used in the String.

        { %d } is a format specifier. It is a placeholder for other data, which should
        replace this specifier in the text.

        In this example, we are going to replace "%d" with age,
        and that's why we pass age as the second
        */
        int age = 35;
        System.out.printf("\nYour age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);

        System.out.printf("\nYour age is %.2f%n", (float) age);

        for (int i = 1; i <= 100_000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("\nYour age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}