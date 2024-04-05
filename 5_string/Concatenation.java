import java.util.Scanner;

public class Concatenation{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short sentence: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter another sentence: ");
        String input2 = scanner.nextLine();

        System.out.print("One more sentence: ");
        String input3 = scanner.nextLine();

        String masterLine = input1+"\n"+input2+"\n"+input3+"\n";
        
        System.out.println("You entered: \n\n"+masterLine);
    }
}