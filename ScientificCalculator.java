import java.util.*;

public class ScientificCalculator {
public static void main(String[] args) {

    boolean menu = true;
    double currentResult = 0.0;
    int numOfCalculations = 0;
    double totalCalculations = 0;
    Scanner input = new Scanner(System.in);

        while (menu) {
            System.out.println("Current Result: "+ currentResult);
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println("");
            System.out.print("Enter Menu Selection: ");
            

            int menuSelection = input.nextInt();
            System.out.println("");

            if (menuSelection > 0 && menuSelection < 7) {    
                
                System.out.print("Enter first operand: ");
                Double firstOperand = input.nextDouble();
                System.out.print("Enter second operand: ");
                Double secondOperand = input.nextDouble();

                if (menuSelection == 1) {
                    currentResult = firstOperand + secondOperand;
                    totalCalculations += totalCalculations;
                } else if (menuSelection == 2) {
                    currentResult = firstOperand - secondOperand;
                    totalCalculations += totalCalculations;
                } else if (menuSelection == 3) {
                    currentResult = firstOperand * secondOperand;
                    totalCalculations += totalCalculations;
                } else if (menuSelection == 4) {
                    currentResult = firstOperand / secondOperand;
                    totalCalculations += totalCalculations;
                } else if (menuSelection == 5) {
                    currentResult = Math.pow(firstOperand, secondOperand);
                    totalCalculations += totalCalculations;
                } else {
                    currentResult = Math.log(secondOperand) / Math.log(firstOperand);
                    totalCalculations += totalCalculations;
                }
                numOfCalculations++;
            } else if (menuSelection == 7) {
                if (numOfCalculations == 0) {
                    System.out.println("Error: no calculations yet to average!");
                } else {
                    System.out.println("Sum of calculations: " + totalCalculations);
                    System.out.println(" Number of calculations: " + numOfCalculations);
                    System.out.println("Average of calculations: "+ (totalCalculations/numOfCalculations));
                }
            } else if (menuSelection == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
                menu = !menu;
            } else {
                System.out.println("Error: Invalid selection!");
            }
        }
    }
}
