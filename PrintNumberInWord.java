public class PrintNumberInWord {

    public static void main(String[] args) {
        printNumberInWord(4);
    }
    public static void printNumberInWord(int number){
        String numberInWord = switch (number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "is an invalid number";
        };
        System.out.println( "The number " + number + " stands for " + numberInWord);
    }
}
