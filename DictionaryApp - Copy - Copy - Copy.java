import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Dictionary Application");
            System.out.println("1. Add a word and its definition");
            System.out.println("2. Retrieve the definition of a word");
            System.out.println("3. Display all word-definition pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word and definition added to the dictionary.");
                    break;
                case 2:
                    System.out.print("Enter a word to retrieve its definition: ");
                    String lookupWord = scanner.nextLine();
                    String foundDefinition = dictionary.get(lookupWord);
                    if (foundDefinition != null) {
                        System.out.println("Definition: " + foundDefinition);
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;
                case 3:
                    System.out.println("Word-Definition Pairs in Alphabetical Order:");
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + ": " + dictionary.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
            }
        }
    }
}
// output
// C:\Users\alok\Desktop>java DictionaryApp
// Dictionary Application
// 1. Add a word and its definition
// 2. Retrieve the definition of a word
// 3. Display all word-definition pairs
// 4. Exit
// Enter your choice (1/2/3/4)