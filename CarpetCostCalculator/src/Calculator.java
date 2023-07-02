public class Calculator {
    /*
    By having an instance field of type Floor in the Calculator class,
    we can access and utilize the properties and methods of a Floor object
    within the Calculator class.
    This allows us to calculate the area of the floor using the getArea() method
    of the Floor object.

    Ditto for the instance field of type Carpet.

    It is essentially, inheritance without inheritance.
    */
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
//        double costPerSquareMeterOfCarpet = floor.getArea() * carpet.getCost();
//        return costPerSquareMeterOfCarpet;
        return floor.getArea() * carpet.getCost();
    }
}
