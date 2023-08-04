public class Main {
    public static void main(String[] args) {
        String carString = """
                Polyphorphism Exercise 1
                ------------------------""";
        System.out.println(carString);

        Car car = new Car(8, "Base car");
//        useCar(car);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
//
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        useCar(mitsubishi);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
//
        Ford ford = new Ford(6, "Ford Falcon");
//        useCar(ford);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
//
        Car holden = new Holden(6, "Holden Commodore");
//        useCar(holden);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

//    public static void useCar(Car car) {
//        car.doCarStuff();
//    }
}