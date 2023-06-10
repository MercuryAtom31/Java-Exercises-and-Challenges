public class NumberOfDaysInMonth {
    /*
        The rule for determining leap years is not as simple as
        just checking if the year is divisible by four.
        While most leap years are divisible by four, there are exceptions to consider.

        The additional checks involving divisibility by 100 and 400 are necessary
        to handle these exceptions and align with the Gregorian calendar leap year rules:

        Years divisible by 4: Most leap years are evenly divisible by 4.
        For example, 2004, 2008, and 2016 are all leap years.

        Years divisible by 100: However, if a year is divisible by 100,
        it is not a leap year unless it is also divisible by 400.
        For example, 1900 was not a leap year, even though it is divisible by 4,
        because it is divisible by 100 but not by 400. On the other hand,
        the year 2000 was a leap year because it is divisible by both 100 and 400.
        By including these additional checks, we ensure that the leap year determination
        follows the rules specified by the Gregorian calendar.
     */
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            /*
            (year % 4 == 0) checks if the year is divisible by 4.
            (year % 100 != 0) checks if the year is not divisible by 100.
            (year % 400 == 0) checks if the year is divisible by 400.
             */
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                return true;
            }
        }
        return false;
    }
}
