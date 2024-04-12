import java.util.Scanner;

public class Prompter {

	public static String getInput (String arg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(arg);
		return scanner.nextLine();
	}
}