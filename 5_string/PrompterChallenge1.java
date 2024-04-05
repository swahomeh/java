import java.util.Scanner;

public class PrompterChallenge1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("What is your surname: ");
        String surname = scanner.nextLine().trim();

        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String date_of_birth = scanner.nextLine().trim();

        System.out.print("How far is your favourite store from your home?: ");
        String distance_from_store = scanner.nextLine().trim();

        String masterLine = name+"\n"+surname+"\n"+date_of_birth+"\n"+distance_from_store+"\n";
        
        System.out.println("You entered: \n\n"+masterLine);
    }
}