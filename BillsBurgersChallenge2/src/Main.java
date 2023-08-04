public class Main {
    public static void main(String[] args) {
//        String burgerString = """
//                Bill's Burgers Challenge 2
//                --------------------------""";
//        System.out.println(burgerString);
        System.out.println("-".repeat(30));
        System.out.println("\t\tWELCOME TO\nBILL'S BURGERS CHALLENGE 2");
        System.out.println("-".repeat(30));

        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularOrder = new MealOrder();
//        regularOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularOrder.setDrinkSize("LARGE");
//        regularOrder.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.addBurgerToppings("MAYO", "RELISH", "MUSTARD");
//        secondMeal.printItemizedList();

//        MealOrder deluxeMeal = new MealOrder("deluxe", "7-Up", "chili");
//        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
//                "CHEESE", "MAYO");
//        deluxeMeal.setDrinkSize("SMALL");
//        deluxeMeal.printItemizedList();
    }
}