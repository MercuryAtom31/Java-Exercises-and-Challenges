public class TeenNumberChecker {

    public static void main(String[] args) {
        boolean isOneOfTheThreeInTheRange1 = hasTeen(9, 99, 19);
        System.out.println(isOneOfTheThreeInTheRange1);

        boolean isOneOfTheThreeInTheRange2 = hasTeen(23, 15, 42);
        System.out.println(isOneOfTheThreeInTheRange2);

        boolean isOneOfTheThreeInTheRange3 = hasTeen(22, 23, 34);
        System.out.println(isOneOfTheThreeInTheRange3 + "\n");

        boolean isTheAgeTeen1 = isTeen(9);
        System.out.println(isTheAgeTeen1);

        boolean isTheAgeTeen2 = isTeen(13);
        System.out.println(isTheAgeTeen2);
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){

        if ((firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19) || (thirdNumber >= 13 && thirdNumber <= 19)){
            return true;
        }

        return false;

    }

    public static boolean isTeen(int age){

        if (age >= 13 && age <= 19){
            return true;
        }
        return false;
    }
}
