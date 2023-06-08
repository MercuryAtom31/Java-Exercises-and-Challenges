public class AreaCalculator {

    public static void main(String[] args) {

        String cm = " cm2";

        System.out.printf("%.2f\n", area(5.0));
        System.out.println(area(-1));

        System.out.println("\n" + area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid radius.");
            return -1.0;
        }
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) {
        double areaOfRectangle = x * y;

        if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
            System.out.println("Invalid value.");
            return -1.0;
        }

        return areaOfRectangle;
    }
}
