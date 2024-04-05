import java.util.Scanner;

public class BooleanConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean (true/false): ");

        String booleanInput = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanInput);
        
        System.out.println("You entered: "+booleanValue);
    }
}