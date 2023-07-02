public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    /*
    Since overloaded methods are essentially the same method name with
    different parameter signature,
    we can call a method from a method to reduce the code repetition.
    */
    public void add(ComplexNumber complexNumber) {
//        this.real += complexNumber.getReal();
//        this.imaginary += complexNumber.getImaginary();
        add(complexNumber.real, complexNumber.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    /*
    Since overloaded methods are essentially the same method name with
    different parameter signature,
    we can call a method from a method to reduce the code repetition.
    */
    public void subtract(ComplexNumber complexNumber) {
//        this.real -= complexNumber.getReal();
//        this.imaginary -= complexNumber.getImaginary();
        subtract(complexNumber.real, complexNumber.imaginary);
    }
}
