import java.util.ArrayList;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add some numbers to the ArrayList
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(13);
        numbers.add(16);
        
        // Calculate the sum of even numbers
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        
        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}
// output
// C:\Users\alok>cd desktop

// C:\Users\alok\Desktop>javac SumEvenNumbers.java

// C:\Users\alok\Desktop>java SumEvenNumbers
// Sum of even numbers: 36
