public class NumberValidator {
	public static boolean numberValidator (String distance) {
		String regex = "^\\d+(\\.\\d+)?(\\/\\d+)?$";
		return distance.matches(regex);
	}
}