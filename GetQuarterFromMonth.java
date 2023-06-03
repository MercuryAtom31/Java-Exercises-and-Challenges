public class GetQuarterFromMonth {

    public static void main(String[] args) {
        /*
        This code is using the ENHANCED switch statement instead of the switch statement.
        */
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");

//            You can group many cases together if you want to test many values.
//            case 3: case 4: case 5:
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "XYZ";
        System.out.println("\n" + month + " is in the " + getQuarter(month) + " quarter.");
    }

    public static String getQuarter(String month) {

        /*
        Enhanced Switch Statement.
        */
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
//            default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
        /*
        Traditional Switch Statement used in a method, returning values.
         */

//        switch (month) {
//            case "JANUARY":
//            case "FEBRUARY":
//            case "MARCH":
//                return "1st";
//            case "APRIL":
//            case "MAY":
//            case "JUNE":
//                return "2nd";
//            case "JULY":
//            case "AUGUST":
//            case "SEPTEMBER":
//                return "3rd";
//            case "OCTOBER":
//            case "NOVEMBER":
//            case "DECEMBER":
//                return "4th";
//        }
//        return "bad";
    }
}