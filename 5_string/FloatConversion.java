import java.util.Scanner;

public class FloatConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float value: ");

        String floatInput = scanner.nextLine();
        float floatValue = Float.parseFloat(floatInput);
        
        System.out.println("You entered: "+floatValue);
    }
}