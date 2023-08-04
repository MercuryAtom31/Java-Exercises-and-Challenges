public class Item {

    //Types are burger, drink, side or topping.
    private String type;
    //Names of the burgers, drinks, sides or toppings.
    private String name;
    //Base price of the item.
    private double price;
    //Default medium size.
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    /*
    The following method returns the name of the item,
    but if the item is a side dish or a drink,
    it also includes the size as part of the name
    to provide more information about the item.
    */
    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:$%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
