import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Starting the complex number calculator application...");

        CalculatorFacade facade = new CalculatorFacade();
        facade.calculate();

        logger.info("Exiting the application.");
    }
}
