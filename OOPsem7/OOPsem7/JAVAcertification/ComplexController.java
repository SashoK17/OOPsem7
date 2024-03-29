public class ComplexController {
    private ComplexView view;

    public ComplexController() {
        this.view = new ComplexView();
    }

    public void addComplexNumbers() {
        ComplexNumber complex1 = view.getUserInput();
        ComplexNumber complex2 = view.getUserInput();
        ComplexNumber result = complex1.add(complex2);
        view.displayResult(result);
    }

    public void multiplyComplexNumbers() {
        ComplexNumber complex1 = view.getUserInput();
        ComplexNumber complex2 = view.getUserInput();
        ComplexNumber result = complex1.multiply(complex2);
        view.displayResult(result);
    }

    public void divideComplexNumbers() {
        ComplexNumber complex1 = view.getUserInput();
        ComplexNumber complex2 = view.getUserInput();
        ComplexNumber result = complex1.divide(complex2);
        view.displayResult(result);
    }
}
