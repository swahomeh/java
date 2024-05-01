public class NumberValidator {
	public static boolean numberValidator (String grade) {
		String regex = "^\\d+(\\.\\d+)?(\\/\\d+)?$";
		return grade.matches(regex);
	}
}