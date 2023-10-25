import java.util.Scanner;
public class calculatorr {

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first number: ");
	            double num1 = s.nextDouble();

	            System.out.print("Enter the operator (+, -, *, /): ");
	            char operator = s.next().charAt(0);

	            System.out.print("Enter the second number: ");
	            double num2 = s.nextDouble();

	            double result;

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 == 0) {
	                        System.out.println("Error: Division by zero is not allowed.");
	                        return;
	                    }
	                    result = num1 / num2;
	                    break;
	                default:
	                    System.out.println("Error: Invalid operator.");
	                    return;
	            }

	            System.out.println("Result: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter valid numbers and operator.");
	        } finally {
	            
	        }
	    }
	}

// output
// C:\Users\alok\Desktop>java calculatorr
// Enter the first number: 10
// Enter the operator (+, -, *, /): +
// Enter the second number: 20
// Result: 30.0