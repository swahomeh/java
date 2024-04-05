import java.util.Scanner;

public class LongConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Long value (positive number): ");

        String longInput = scanner.nextLine();
        long longValue = Long.parseLong(longInput);
        
        System.out.println("You entered: "+longValue);
    }
}