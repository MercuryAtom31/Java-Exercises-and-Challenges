public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Hichem Benzair", 120000, "hichem@hotmail.com");
        System.out.println("Name: " + customer1.getName()
                + "\nCredit Limit: "
                + customer1.getCreditLimit()
                + "\nEmail Address: "
                + customer1.getEmail());

        Customer customer2 = new Customer();
        System.out.println("\nName: " + customer2.getName()
                + "\nCredit Limit: "
                + customer2.getCreditLimit()
                + "\nEmail Address: "
                + customer2.getEmail());

        Customer customer3 = new Customer("Joe Schmo", 2500.00, "joeschmo@hotmail.com");
        System.out.println("\nName: " + customer3.getName()
                + "\nCredit Limit: "
                + customer3.getCreditLimit()
                + "\nEmail Address: "
                + customer3.getEmail());

    }
}