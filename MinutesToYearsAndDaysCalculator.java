public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearAndDays(525600L);
        printYearAndDays(1051200L);
        printYearAndDays(561600L);

    }
    public static void printYearAndDays(long minutes) {


        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        long minutesInDay = 60L * 24L;
        long minutesInYear = minutesInDay * 365L;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " min = " + years + " year(s) and " + days + " day(s)");

    }

}
