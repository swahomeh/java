import java.time.*;

public class AgeCalculator {
	public static int ageCalculator (String dob) {
		//int currentYear = LocalDate.now().getYear(); // using LocalDate instead of Year

		//String yobString = dob.substring(6); // extract characters from index 6
		String yobString = dob.split("/")[2];

		int yob = Integer.parseInt(yobString);
		int currentYear = Year.now().getValue();

		int age = currentYear - yob;

		return age;
	}
}