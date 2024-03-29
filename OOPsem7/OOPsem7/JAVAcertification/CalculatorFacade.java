import java.util.Scanner;

public class CalculatorFacade {
    private ComplexController controller;

    public CalculatorFacade() {
        this.controller = new ComplexController();
    }

    public void calculate() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Choose operation (+, *, /): ");
            String operation = scanner.nextLine();

            if (operation.equals("+")) {
                controller.addComplexNumbers();
            } else if (operation.equals("*")) {
                controller.multiplyComplexNumbers();
            } else if (operation.equals("/")) {
                controller.divideComplexNumbers();
            }
        }
    }
}
