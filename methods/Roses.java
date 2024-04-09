import java.util.Scanner;

public class Roses{

    public void printRoses(){
        String red = "Roses are red, \nViolets are blue";
        String sheep = "\nA sheep is dumb, \nAnd so are you.";
        String author = "Roses Are Red - Stanley M.";
        System.out.println("\n" + author + "\n");
        System.out.println(red+sheep);
    }

    public void printMrWH () {
        String title = "Dedication to Mr. W.T";
        String author = "Shakespeare";
        String sonnet = "TO.THE.ONLIE.BEGETTER.OF. \nTHESE.INSUING.SONNETS. \nMr.W.H. ALL.HAPPINESSE. \nAND.THAT.ETERNITIE. \nPROMISED. \nBY. \nOUR.EVER-LIVING.POET. \nWISHETH. \nTHE.WELL-WISHING. \nADVENTURER.IN. \nSETTING. \nFORTH. \nT.T.";

        System.out.println("\n\n"+title+" - "+author+"\n");
        System.out.println(sonnet);
    }

    public void grandpasComputer () {
        String title = "A Grandchild's Guide to Using Grandpa's Computer";
        String author = "Gene Ziegler";
        String poem = "If a packet hits a pocket on a socket on a port, \nAnd the bus is interrupted as a very last resort, \nAnd the address of the memory makes your floppy disk abort \nThen the socket packet pocket has an error to report!";

        System.out.println("\n\n"+title+" - "+author+"\n");
        System.out.println(poem);
    }    

    public static void main(String[] args) {
        Roses obj = new Roses();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nPick Your Poem/Sonnet:");
            System.out.println("1. Roses are red");
            System.out.println("2. Dedication to Mr. W.T");
            System.out.println("3. Grandpa's Computer");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    obj.printRoses();
                    break;
                case 2:
                    obj.printMrWH();
                    break;
                case 3:
                    obj.grandpasComputer();
                    break;
                case 4:
                    System.out.println("Exiting. Have a great day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");                    
            }
        }
        
    }
}