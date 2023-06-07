public class EqualSumChecker {

    public static void main(String[] args) {

        boolean total1 = hasEqualSum(1, 1, 1);
        boolean total2 = hasEqualSum(1, 1, 2);
        boolean total3 = hasEqualSum(1, -1, 0);

        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);

    }
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber + secondNumber == thirdNumber){
            return true;
        }
        return false;
    }
}
