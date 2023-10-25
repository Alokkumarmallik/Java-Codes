import java.util.Scanner;

public class alok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String userInput = scanner.nextLine();
        
        try {
           
            int intValue = Integer.parseInt(userInput);
            System.out.println("Successfully converted to integer: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
           
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            
        } finally {
            
        }
    }
}
