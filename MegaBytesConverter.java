public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //If invalid input.
        if (kiloBytes < 0) {
            System.out.println("Invalid Value.");
        } else {
            //Calculate.
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            //Printing message.
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " +
                    remainingKilobytes + " KB.");
        }
    }
}
