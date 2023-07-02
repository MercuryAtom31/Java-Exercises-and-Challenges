public class Student {

    private String id, name, dateOfBirth, classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    //@Override annotation means an overridden method.
    /*
    The toString() method is responsible for returning a string representation of an object.
    By having the @Override annotation, it menas that it overrides the toString() method
    of the Object class.
    The toString() method in the Object class,
    which is the superclass for all classes in Java.
    */
    @Override
    public String toString() {
        return "Student {" +
                "id ='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", dateOfBirth ='" + dateOfBirth + '\'' +
                ", classList ='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
