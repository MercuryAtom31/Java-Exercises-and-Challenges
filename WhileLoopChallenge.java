public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishedNumber = 20;
        int evenNumberCounter = 0;
        int oddNumberCounter = 0;

        while (number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)){
                oddNumberCounter++;
                System.out.println("Odd number " + number);
                continue;
            }
            evenNumberCounter++;
            System.out.println("Even number " + number);

            if (evenNumberCounter >= 5){
                break;
            }
        }
        System.out.println("\nTotal of even numbers: " + evenNumberCounter + "\nTotal of ODD numbers: " + oddNumberCounter);
    }
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
