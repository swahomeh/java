import java.util.Scanner;

public class ReturnTypes {
	public static int addition(int int1, int int2) {
		return int1 + int2;
	}

	public static int num1 (Scanner scanner) {
		System.out.print("Enter the first number: ");
		return scanner.nextInt();
	}

	public static int num2 (Scanner scanner) {
		System.out.print("Enter the second number: ");
		return scanner.nextInt();
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReturnTypes obj = new ReturnTypes();

		int int1 = obj.num1(scanner);
		int int2 = obj.num2(scanner);

		int summation = obj.addition(int1, int2);

		System.out.println("\nThe sum of the numbers entered is: " + summation);
	}
}