public class Challenge1Main {
	public static void main (String[] arg) {
		String name = "";
		String surname = "";
		String dob = new String();
		String distance = new String("");
		Boolean isDOBvalid = false;
		Boolean isNumber = false;
		byte count = 0;
		final byte COUNT_LIMIT = 3;

		while(true) {
			name = Prompter.getInput("Enter your first name? ").trim();
			if (!name.isEmpty()) {
				break;
			} else {
				Printer.info ("* You didn't enter anything!");
			}
		}

		while(true) {
			surname = Prompter.getInput("Enter your surname? ").trim();
			if (!surname.isEmpty()) {
				break;
			} else {
				Printer.info ("* You didn't enter anything!");
			}
		}

		while (true) {
			int trials = COUNT_LIMIT - count;

			if (trials >= 0 && trials <= (COUNT_LIMIT)) {
				dob = Prompter.getInput("What is your date of birth? (DD/MM/YYYY) ");
				isDOBvalid = DateValidator.dobValidator(dob);

				if (!isDOBvalid) {
					if (trials > 0) {
						Printer.info(" [*] Invalid DOB!");
						Printer.info("< " + trials + " trials remaining >");
					}
					count++;
				} else {
					count = 0;
					break;
				}
			} else {
				Printer.info(" [*] Sorry! Maximum trials limit reached.");
				Printer.info(" Exiting...");
				return;
			}
		}

		while (true) {
			int trials = COUNT_LIMIT - count;

			if (trials >= 0 && trials <= (COUNT_LIMIT)) {
				distance = Prompter.getInput("How far is your house from your favourite store? ");
				isNumber = NumberValidator.numberValidator(distance);

				if (!isNumber) {
					if (trials > 0) {
						Printer.info(" [*] Invalid distance number!");
						Printer.info("< " + trials + " trials remaining >");
					}
					count++;
				} else {
					count = 0;
					break;
				}
			} else {
				Printer.info(" [*] Sorry! Maximum trials limit reached.");
				Printer.info(" Exiting...");
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