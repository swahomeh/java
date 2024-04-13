public class MillisecondsCalculator {
	public static double millisecondsCalculator (int age) {
		String age_as_string = Integer.toString(age);
		double age_in_years = Double.parseDouble(age_as_string);
		double age_in_milliseconds = age_in_years * 3.1536E+10;

		return age_in_milliseconds;
	}
}