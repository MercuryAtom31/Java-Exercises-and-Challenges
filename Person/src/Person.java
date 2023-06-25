public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public int setAge(int age){
        if ((age < 0) || (age > 100)) return this.age = 0;
        return this.age = age;
    }

    public boolean isTeen(){
//        if (age > 12 && age < 20) return true;
//        return false;
        return (age > 12 && age < 20) ? true : false;
    }

    public String getFullName(){
//        return (firstName == "" && lastName == "") ? ""
//                : (firstName == "") ? lastName
//                : (lastName == "") ? firstName : firstName + " " + lastName;
        /*
        In Java, comparing strings using the == operator checks for reference equality,
        which means it checks if the two string variables refer to the exact same object
        in memory.
        On the other hand, the isEmpty() method checks if a string is empty,
        i.e., it contains no characters.

        Therefore, it's generally recommended to use the isEmpty() method
        for checking if a string is empty instead of relying on == "" comparison.
        */
        return (firstName.isEmpty() && lastName.isEmpty()) ? ""
                : (firstName.isEmpty()) ? lastName
                : (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
    }
}
