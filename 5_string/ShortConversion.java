import java.util.Scanner;

public class ShortConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short value: ");

        String shortInput = scanner.nextLine();
        short shortValue = Short.parseShort(shortInput);
        
        System.out.println("You entered: "+shortValue);
    }
}