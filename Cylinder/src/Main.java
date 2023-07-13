public class Main {
    public static void main(String[] args) {

        String cylinderProject = """
                Cylinder  Project
                *-*-*-*-*-*-*-*-*\n""";
        System.out.println(cylinderProject);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.printf("circle.area= %.2f %n", circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.printf("cylinder.area= %.2f %n", cylinder.getArea());
        System.out.printf("cylinder.volume= %.2f %n", cylinder.getVolume());
    }
}