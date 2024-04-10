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

		String num1 = Integer.toHexString(obj.num1(scanner));
		String num2 = Integer.toHexString(obj.num2(scanner));

		int result = Integer.parseInt(num1, 16) * Integer.parseInt(num2, 16);

        System.out.println("\nHexadecimal num1: 0x" + num1);
        System.out.println("Hexadecimal num2: 0x" + num2);

		System.out.println("\nMultiplication result in hex: 0x" + (Integer.toHexString(result)));
	}
}