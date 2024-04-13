public class SecondsCalculator {
	public static double secondsCalculator (int age) {
		String age_as_string = Integer.toString(age);
		double age_in_years = Double.parseDouble(age_as_string);
		double age_in_seconds = age_in_years * 31536000;

		return age_in_seconds;
	}
}