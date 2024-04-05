import java.util.Scanner;

public class ByteConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short value: ");

        String byteInput = scanner.nextLine();
        byte byteValue = Byte.parseByte(byteInput);
        
        System.out.println("You entered: "+byteValue);
    }
}