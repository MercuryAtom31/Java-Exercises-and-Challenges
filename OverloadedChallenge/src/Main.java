public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + " cm");
        System.out.println("68in = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        //Formula: 1 inch = 2.54 cm.
        return heightInInches * 2.54;
//        double totalHeightInInches = heightInInches * 2.54;
//        return totalHeightInInches;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        //Formula: 1 foot = 12 inches.
        int feetToInches, totalInches;
        double result = 0.0d;

        if (heightInFeet < 0) {
            System.out.println("Invalid Number.");
        } else {
            feetToInches = heightInFeet * 12;
            totalInches = feetToInches + remainingHeightInInches;
            result = convertToCentimeters(totalInches);
        }
        return result;
    }
}
