import java.util.Scanner;

public class ComplexView {
    private Scanner scanner;

    public ComplexView() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Result: " + result.getReal() + " + " + result.getImaginary() + "i");
    }

    public ComplexNumber getUserInput() {
        System.out.print("Enter the real part of the complex number: ");
        double real = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the complex number: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}
