import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidator {
	public static boolean dobValidator (String dob) {

		final String DESIRED_DATE_FORMAT = "dd/MM/yyyy";

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern (DESIRED_DATE_FORMAT);

		try {
			LocalDate date = LocalDate.parse(dob, dateFormat);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}