import java.util.Scanner;

public class IntegerConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        
        System.out.println("You entered: "+intValue);
    }
}