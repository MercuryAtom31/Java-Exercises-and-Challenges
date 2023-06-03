public class NatoPhoneticAlphabetSwitchStatement {

    public static void main(String[] args) {

        char letter = '3';

        switch (letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A = Able, B = Baker, C = Charlie, D = Dog, E = Easy");
                break;
            case 'F': case 'G': case 'H': case 'I': case 'J':
                System.out.println("F = Fox, G = George, H = How, I = Item, J = Jig");
                break;
            case 'K': case 'L': case 'M': case 'N': case 'O':
                System.out.println("K = King, L = Love, M = Mike, N = Nan, O = Oboe");
                break;
            case 'P': case 'Q': case 'R': case 'S': case 'T':
                System.out.println("P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare");
                break;
            case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z':
                System.out.println("U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra");
                break;
            default:
                System.out.println("The following letter " + letter + " was not found.");
                break;
        }

    }

}
