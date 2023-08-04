public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

//    public void doCarStuff() {
//        String carString = """
//                \nCar
//                ---""";
//        System.out.println(carString);
//        startEngine();
//        accelerate();
//        brake();
//    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " >> engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " >> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " >> is braking";
    }
//    @Override
//    public void doCarStuff() {
//        String mitsubishiString = """
//                \nMITSUBISHI
//                ----------""";
//        System.out.println(mitsubishiString);
//        startEngine();
//        accelerate();
//        brake();
//    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " ==> engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " ==> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " ==> is braking";
    }

//    @Override
//    public void doCarStuff() {
//        String holdenString = """
//                \nHOLDEN
//                ------""";
//        System.out.println(holdenString);
//        startEngine();
//        accelerate();
//        brake();
//    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --->> engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " --->> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " --->> is braking";
    }

//    @Override
//    public void doCarStuff() {
//        String fordString = """
//                \nFORD
//                ----""";
//        System.out.println(fordString);
//        startEngine();
//        accelerate();
//        brake();
//    }
}
