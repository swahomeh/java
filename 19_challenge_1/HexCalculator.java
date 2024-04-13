public class HexCalculator {
	public static String hexCalculator (int age) {
		String age_in_hexadecimal = Integer.toHexString(age);

		return "0x"+age_in_hexadecimal;
	}
}