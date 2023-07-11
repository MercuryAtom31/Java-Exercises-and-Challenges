public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance Challenge 1\n");

        Employee tim = new Employee("Tim", "11/11/1985"
                ,"01/01/2022");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge() + " years old");
        System.out.println("Pay = $" + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println("\n" + joe);

        System.out.println("\nJoe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("\nJoe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println("\n" + mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}