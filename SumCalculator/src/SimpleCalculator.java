public class SimpleCalculator {

    private double firstNumber = 0.0;
    private double secondNumber = 0.0;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double num1){
        this.firstNumber = num1;
    }

    public void setSecondNumber(double num2){
        this.secondNumber = num2;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
//        if (secondNumber == 0) return 0;
//        return firstNumber / secondNumber;
        return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
    }
}
