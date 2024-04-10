import java.util.Scanner;

public class LiteralSumHex {

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
		LiteralSumHex obj = new LiteralSumHex();

		int num1 = obj.num1(scanner);
		int num2 = obj.num2(scanner);

		int result = num1 * num2;

        System.out.println("\nHexadecimal num1: 0x" + Integer.toHexString(num1));
        System.out.println("Hexadecimal num2: 0x" + Integer.toHexString(num2));

		System.out.println("\nMultiplication result in hex: 0x" + (Integer.toHexString(result)));
	}
}