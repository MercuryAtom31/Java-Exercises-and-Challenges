public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //(1) Constructor.
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //(2) No-args constructor with constructor chaining: constructor 2 with 3.
    public Customer() {
        this("Zino Dino", "zino@email.com");
    }

    //(3) Constructor chaining: constructor 3 with 1.
    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    //Getters.
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
