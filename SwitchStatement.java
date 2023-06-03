public class SwitchStatement {

    public static void main(String[] args) {

//        int value = 3;
//
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        /*
        This code is using the switch statement instead of an if statement
        because our test conditions are testing a single variable's state.
        */
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
//            You can group many cases together if you want to test many values.
//            case 3: case 4: case 5:
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }

}
