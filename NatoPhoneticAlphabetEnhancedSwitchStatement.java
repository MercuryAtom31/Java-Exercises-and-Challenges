public class NatoPhoneticAlphabetEnhancedSwitchStatement {

    public static void main(String[] args) {

        char letter = '3';

        switch (letter) {
            case 'A', 'B', 'C', 'D', 'E' -> System.out.println("A = Able, B = Baker, C = Charlie, D = Dog, E = Easy");
            case 'F', 'G', 'H', 'I', 'J' -> System.out.println("F = Fox, G = George, H = How, I = Item, J = Jig");
            case 'K', 'L', 'M', 'N', 'O' -> System.out.println("K = King, L = Love, M = Mike, N = Nan, O = Oboe");
            case 'P', 'Q', 'R', 'S', 'T' -> System.out.println("P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare");
            case 'U', 'V', 'W', 'X', 'Y', 'Z' ->
                    System.out.println("U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra");
            default -> System.out.println("The following letter " + letter + " was not found.");
        }
    }
}