public class ConditionalsTest {
	public static void main (String[] arg) {
		String name = "";
		String surname = new String("");
		String grade_choice = new String ();
		char block = '\0';
		byte count = 0;
		final byte COUNT_LIMIT = 3;
		boolean exitWhile = false;

		while(true) {
			name = Prompter.getInput("Enter your first name? ").trim();
			if (!name.isEmpty()) {
				break;
			} else {
				Printer.info ("* Please enter a valid name.");
			}
		}

		while(true) {
			surname = Prompter.getInput("Enter your surname? ").trim();
			if (!surname.isEmpty()) {
				break;
			} else {
				Printer.info ("* Please enter a valid name.");
			}
		}

        while (!exitWhile) {
			int trials = COUNT_LIMIT - count;

			if (trials >= 0 && trials <= COUNT_LIMIT) {        	
	            Printer.info("\nChoose your Grade:");
	            Printer.info("1. Primary School");
	            Printer.info("2. High School");
	            Printer.info("3. Exit");
	            grade_choice = Prompter.getInput("Enter your choice:");
	            int grade = Integer.parseInt(grade_choice);

	            switch (grade) {
	                case 1:
	                	block = 'B';
	                	exitWhile = true;
	                    break;
	                case 2:
	                	block = 'A';
	                	exitWhile = true;
	                    break;
	                case 3:
	                    Printer.info("Exiting. Have a great day!");
	                    return;
	                default:
	                    Printer.info("Invalid choice! Please try again.");
	                    Printer.info("< " + trials + " trials remaining >");
	                    count++;
	            }

			} else {
				Printer.info(" [*] Sorry! Maximum trials limit reached.");
				Printer.info(" Exiting...");
				return;
			}            
        }

        if (block != 0) {
        	System.out.println(class_teacher(block));
        }
	}

	private static String class_teacher (char block) {
		String teacher = "";

		switch (block) {
			case 'A':
				teacher = "Atieno";
				break;
			case 'B':
				teacher = "Boniface";
				break;
		}

		return teacher;
	}
}