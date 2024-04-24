public class Challenge1Main {
	public static void main (String[] arg) {
		String name = Prompter.getInput("what is your name? ");
		String surname = Prompter.getInput("What is your surname? ");

		String dob = new String();
		String distance = new String("");
		Boolean isDOBvalid = false;
		Boolean isNumber = false;

		byte count = 0;
		byte COUNT_LIMIT = 3;

		while (true) {
			dob = Prompter.getInput("What is your date of birth? ");
			isDOBvalid = DateValidator.dobValidator(dob);
			int count_num = count++;
			int trials = COUNT_LIMIT - count_num;

			if (count <= (COUNT_LIMIT + 1)) {
				if (!isDOBvalid) {
					System.out.println("\n [*] Invalid DOB!\n");
					System.out.println("< " + trials + " trials remaining >\n");
				} else {
					count = 0;
					break;
				}
			} else {
				System.out.println("\n [*] Sorry! Maximum trials limit reached.\n");
				System.out.println(" Exiting...\n");
				return;
			}
		}

		while (true) {
			distance = Prompter.getInput("How far is your house from your favourite store? ");
			isNumber = NumberValidator.numberValidator(distance);
			int count_num = count++;
			int trials = COUNT_LIMIT - count_num;

			if (count <= (COUNT_LIMIT + 1)) {
				if (!isNumber) {
					System.out.println("\n [*] Invalid distance number!\n");
					System.out.println("< " + trials + " trials remaining >\n");
				} else {
					count = 0;
					break;
				}
			} else {
				System.out.println("\n [*] Sorry! Maximum trials limit reached.\n");
				System.out.println(" Exiting...\n");
				return;
			}
			
		}

		if (isDOBvalid && isNumber) {
			int age = AgeCalculator.ageCalculator(dob);
			double age_in_seconds = SecondsCalculator.secondsCalculator(age);
			double age_in_milliseconds = MillisecondsCalculator.millisecondsCalculator(age);
			String age_in_hexadecimal = HexCalculator.hexCalculator(age);
			String age_in_binary = BinaryCalculator.binaryCalculator(age);

			double distance_in_miles = MilesCalculator.milesCalculator(distance);
			double distance_in_meters = MetersCalculator.metersCalculator(distance);			

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