import java.util.Scanner;

public class CharacterConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String characterInput = scanner.nextLine();
        
        for (int i = 0; i < characterInput.length(); i++) {
            char currentChar = characterInput.charAt(i);
            System.out.println("Character at position " + i + ": " + currentChar);
        }
    }
}