public class ConditionalsTest {
	public static void main (String[] arg) {
		String name = "";
		String surname = new String("");
		Integer grade = null; // Object
		boolean is_grade = false;
		char block = '\0'; // null
		String class_teacher = "";
		String pe_teacher = "";
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
				Printer.info ("* Please enter a valid surname.");
			}
		}

        while (!exitWhile) {
			int trials = COUNT_LIMIT - count;

			if (trials >= 0 && trials <= COUNT_LIMIT) {
	            String grade_choice = Prompter.getInput("What is your Grade? ");
	            is_grade = NumberValidator.numberValidator(grade_choice);

	            if (is_grade) {
		            double d_grade = Double.parseDouble(grade_choice);
		            grade = (int)(d_grade);

		            if (grade > 0 && grade <= 12) {
		            	exitWhile = true;
		            } else {
		            	count++;

		            	if (trials > 0) {
			            	Printer.info(" [*] Invalid grade! Please try again.");
			            }
		            }
		        } else {
	            	count++;

	            	if (trials > 0) {
		            	Printer.info(" [*] Invalid grade! Please try again.");
		            }
	            }

			} else {
				Printer.info(" [*] Sorry! Maximum trials limit reached.");
				Printer.info(" Exiting...");
				return;
			}            
        }

        if (grade != null) {
        	block = block(grade);
        	class_teacher = class_teacher(grade);
        	pe_teacher = pe_teacher(grade);

        	Printer.print(name, surname, block, class_teacher, pe_teacher);
        }
	}

	public static char block (int grade) {
		char student_block = '\0';

        if (grade > 0 && grade <= 9) {
        	student_block = 'B';
        } else if (grade > 9 && grade <= 12) {
        	student_block = 'A';
        } else {
        	student_block = '\0';
        }

        return student_block;
	}

	private static String class_teacher (int grade) {
		// better with a hashmap (out of scope for this topic)
		String teacher = "";

        switch (grade) {
        	case 1:
        		teacher = "Tr. Atieno";
        		break;
        	case 2:
        		teacher = "Tr. Mondi";
        		break;
        	case 3:
        		teacher = "Tr. Bethwel";
        		break;
        	case 4:
        		teacher = "Tr. Kiplagat";
        		break;
        	case 5:
        		teacher = "Tr. Sumo";
        		break;
        	case 6:
        		teacher = "Tr. Mbiti";
        		break;
        	case 7:
        		teacher = "Tr. Silus";
        		break;
        	case 8:
        		teacher = "Tr. Enkem";
        		break;
        	case 9:
        		teacher = "Tr. Wankan";
        		break;
        	case 10:
        		teacher = "Tr. Mahindi";
        		break;
        	case 11:
        		teacher = "Tr. Kanyoni";
        		break;
        	case 12:
        		teacher = "Tr. Ezekiel";
        		break;
        	default:
        		teacher = "N/A";
        }

		return teacher;
	}

	private static String pe_teacher (int grade) {
		String ped_teacher = "";

        if (grade > 0 && grade <= 6) {
        	ped_teacher = "Tr. Boaz";
        } else if (grade > 6 && grade <= 9) {
        	ped_teacher = "Tr. Crocodile";
        } else if (grade > 9 && grade <= 10) {
        	ped_teacher = "Tr. Scorpion";
        } else if (grade > 10 && grade <= 12) {
        	ped_teacher = "Tr. Pablo";
        } else {
        	ped_teacher = "N/A";
        }		

		return ped_teacher;
	}	
}