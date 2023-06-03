public class EnhancedSwitchStatement {

    public static void main(String[] args) {
        /*
        This code is using the ENHANCED switch statement instead of the switch statement.
        */
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");

//            You can group many cases together if you want to test many values.
//            case 3: case 4: case 5:
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        /*
        The code below is written using the switch statement INSTEAD of the enhanced switch statement.
        */
//        int switchValue = 3;
//
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
////            You can group many cases together if you want to test many values.
////            case 3: case 4: case 5:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Was a 3, a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4, or 5");
//                break;
//        }

    }
}
