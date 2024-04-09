import java.util.Scanner;

public class UserPrompter {
	static String namePrompt (Scanner scanner) {
		System.out.print("What's your name? ");
		return scanner.nextLine().trim();
	}

	static String surnamePrompt (Scanner scanner) {
		System.out.print("What's your surname? ");
		return scanner.nextLine().trim();
	}

	static int agePrompt (Scanner scanner) {
		System.out.print("What's your age? ");
		return scanner.nextInt();
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserPrompter obj = new UserPrompter();

		String name = obj.namePrompt(scanner);
		String surname = obj.surnamePrompt(scanner);
		int age = obj.agePrompt(scanner);

		System.out.println("\nHello, " + name + " " + surname + ". Your age is " + age + " years old.");
	}
}