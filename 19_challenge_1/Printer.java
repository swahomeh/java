public class Printer {
	public static void print (String name, String surname, String dob, String distance, int age, double distanceMiles) {
		System.out.println("\nYour name is " + name + " " + surname + ". Your DOB is " + dob + ", and you live " + distance + " kilometers from your favourite shop. You are " + age + " years old.\n");

		System.out.println("Distance of the shop in miles is: " + distanceMiles);
	}
}