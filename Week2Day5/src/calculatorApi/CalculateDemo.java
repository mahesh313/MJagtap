package calculatorApi;

/**
 * Created by jagtapm on 7/28/2017.
 */
public class CalculateDemo {
    public static void main(String[] args) {
        CalculatorService.manipulateNumbers(4, 5, (double number1, double number2) -> {
            System.out.printf("Sum is %d", (number1 + number2) );

        });

        CalculatorService.manipulateNumbers(4, 5, (double number1, double number2) -> {
            System.out.printf("multiplication is %d", (number1 * number2) );

        });
    }
}
