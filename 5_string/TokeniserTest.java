import java.io.*;
import java.util.*; // import java.util.Scanner;

public class TokeniserTest{
    private static final String CSV_FILE_NAME = "user_records.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new user");
            System.out.println("2. View existing CSV records");
            System.out.println("3. Search user(s)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    searchUser(scanner);
                    break;
                case 4:
                    System.out.println("Exiting. Have a great day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addUser(Scanner scanner) {

        System.out.print("What is your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("What is your surname: ");
        String surname = scanner.nextLine().trim();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine().trim();

        try (PrintWriter pw = new PrintWriter(new FileWriter(CSV_FILE_NAME, true))) {
            File file = new File(CSV_FILE_NAME);
            if (file.length() == 0) {
                pw.println("name,surname,age");
            }        
            pw.println(name + "," + surname + "," + age);
            System.out.println("User data saved successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    private static void viewRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_NAME))) {
            String line;
            System.out.println("\nExisting records:");

            boolean isFirstRecord = true;

            while ((line = br.readLine()) != null) {
                if (isFirstRecord) {
                    isFirstRecord = false;
                    continue; // skip csv header
                }

                String[] userData = line.split(",");
                System.out.println("Name: " + userData[0] + ", Surname: " + userData[1] +
                        ", Age: " + userData[2]);
            }

        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
    }

    private static void searchUser(Scanner scanner) {
        System.out.print("Enter search key: ");
        String searchKey = scanner.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_NAME))) {
            String line;
            System.out.println("\nMatching records for key - "+searchKey+": ");

            System.out.println("Name, Surname, Age\n");

            boolean isFirstRecord = true;

            while ((line = br.readLine()) != null) {
                if (isFirstRecord) {
                    isFirstRecord = false;
                    continue; // skip csv header
                }

                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                if (tokenizer.countTokens() >= 3) {
                    String name = tokenizer.nextToken().trim();
                    String surname = tokenizer.nextToken().trim();
                    String age = tokenizer.nextToken().trim();
                    if (name.equalsIgnoreCase(searchKey)) {
                        System.out.println(name + ", " + surname + ", " + age);
                    }
                } else {
                    System.err.println("Invalid record format: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
    }
}