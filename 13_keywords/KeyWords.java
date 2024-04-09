import java.util.Scanner;

public class KeyWords{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHello there:");

            System.out.print("1. Enter your first name:");
            String name = scanner.nextLine();

            System.out.print("2. Enter your surname:");
            String surname = scanner.nextLine();

            System.out.print("3. Enter your home town:");
            String town = scanner.nextLine();
            
            System.out.println("Hello, " + name + " " + surname + ". Your hometown is " + town + ".");
            return;
        }
    }
}