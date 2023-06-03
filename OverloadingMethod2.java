public class OverloadingMethod2 {

    public static void main(String[] args) {
            String combineFirstName = testingOverloadingMethod("Hichem");
            String combineMiddleAndLastName = testingOverloadingMethod("Azzeddine", "Benzair");
            System.out.println(combineFirstName + combineMiddleAndLastName);
    }

    public static String testingOverloadingMethod(String name){
        return "The name is " + name;
    }

    public static String testingOverloadingMethod(String middleName, String lastName){
        return " " + middleName + " " + lastName;
    }
}
