import java.util.Scanner;

public class DoubleConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");

        String doubleInput = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleInput);
        
        System.out.println("You entered: "+doubleValue);
    }
}