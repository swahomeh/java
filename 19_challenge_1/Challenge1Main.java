public class Challenge1Main {
	public static void main (String[] arg) {
		String name = Prompter.getInput("what is your name? ");
		String surname = Prompter.getInput("What is your surname? ");
		String dob = Prompter.getInput("What is your date of birth? ");
		String distance = Prompter.getInput("How far is your house from your favourite store? ");

		Boolean isDOBvalid = DateValidator.dobValidator(dob);
		Boolean isNumber = NumberValidator.numberValidator(distance);

		// System.out.println("Age? " + age);

		if (isDOBvalid && isNumber) {
			int age = AgeCalculator.ageCalculator(dob);
			double distance_in_miles = MilesCalculator.milesCalculator(distance);
			double distance_in_meters = MetersCalculator.metersCalculator(distance);
			double age_in_seconds = SecondsCalculator.secondsCalculator(age);
			double age_in_milliseconds = MillisecondsCalculator.millisecondsCalculator(age);
			String age_in_hexadecimal = HexCalculator.hexCalculator(age);
			String age_in_binary = BinaryCalculator.binaryCalculator(age);			

			Printer printer = new Printer(); // obj demo (not necessary for accessing static methods)

			printer.print(name, surname, dob, distance, age, distance_in_miles, distance_in_meters, age_in_seconds, age_in_milliseconds, age_in_hexadecimal, age_in_binary);
		} else {
			if ((isDOBvalid || isNumber) == false) { // NOR
				System.out.println("\nInvalid date and distance. Exiting...");
			} else if (isDOBvalid != true) {
				System.out.println("\nInvalid DOB. Exiting...");
			} else if (isNumber != true) {
				System.out.println("\nInvalid distance. Exiting...");
			} else {
				System.out.println("\nInvalid input. Exiting");
			}
		}
	}
}