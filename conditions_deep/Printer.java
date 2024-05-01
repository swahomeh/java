public class Printer {
	public static void print (String name, String surname, char block, String class_teacher, String pe_teacher) {

		System.out.println("\n ********************************************* \n");

		System.out.println("\n[*] Hello " + name + " " + surname + "! Your are admitted to block " + block + ", and your class teacher is " + class_teacher + ", with your PE teacher being " + pe_teacher + ".\n");
	}


	public static void info (String message) {
		System.out.println("\n" + message + "\n");
	}
}