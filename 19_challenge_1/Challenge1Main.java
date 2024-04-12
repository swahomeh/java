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
			double distanceMiles = MilesCalculator.milesCalculator(distance);

			Printer printer = new Printer();

			printer.print(name, surname, dob, distance, age, distanceMiles);
		} else {
			if ((isDOBvalid || isNumber) == false) { // NOR
				System.out.println("\nInvalid date and distance. Exiting...");
			} else if (isDOBvalid != true) {
				System.out.println("\nInvalid DOB. Exiting...");
			} else if (isNumber != true) {
				System.out.println("\nInvalid distance. Exiting...");
			}
		}
	}
}