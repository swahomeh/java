import java.util.Scanner;

public class LiteralSum {

	static int num1 (Scanner scanner) {
		System.out.print("Enter num1: ");
		return scanner.nextInt();
	}

	static int num2 (Scanner scanner) {
		System.out.print("Enter num2: ");
		return scanner.nextInt();
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		LiteralSum obj = new LiteralSum();

		int num1 = obj.num1(scanner);
		int num2 = obj.num2(scanner);

		System.out.println("\nSum: " + (num1+num2));
	}
}