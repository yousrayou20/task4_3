//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("A - Convert from any system to the decimal system");
            System.out.println("B - Convert from decimal system to another system ");
            System.out.println("C - Summing up number from different system");
            System.out.println("D - Subtraction numbers from different system");
            System.out.println("E - Multiplication numbers from different systems");
            System.out.println("F - Division numbers from different systems");
            System.out.println("W - Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'A':
                    convertToDecimal(scanner);
                    break;
                case 'B':
                    convertFromDecimal(scanner);
                    break;
                case 'C':
                    addition(scanner);
                    break;
                case 'D':
                    subtraction(scanner);
                    break;
                case 'E':
                    multiplication(scanner);
                    break;
                case 'F':
                    division(scanner);
                    break;
                case 'W':
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'W');
        scanner.close();
    }

    private static void convertToDecimal(Scanner scanner) {
        // Implement conversion to decimal logic here
        System.out.println("Convert to Decimal");
    }

    private static void convertFromDecimal(Scanner scanner) {
        // Implement conversion from decimal logic here
        System.out.println("Convert from Decimal");
    }

    private static void addition(Scanner scanner) {
        // Implement addition logic here
        System.out.println("Addition");
    }

    private static void subtraction(Scanner scanner) {
        // Implement subtraction logic here
        System.out.println("Subtraction");
    }

    private static void multiplication(Scanner scanner) {
        // Implement multiplication logic here
        System.out.println("Multiplication");
    }

    private static void division(Scanner scanner) {
        // Implement division logic here
        System.out.println("Division");
    }

}