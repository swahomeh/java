public class Printer {
	public static void print (String name, String surname, String dob, String distance, int age, double distance_in_miles, double distance_in_meters, double age_in_seconds, double age_in_milliseconds, String age_in_hexadecimal, String age_in_binary) {

		System.out.println("\n ********************************************* \n");

		System.out.println("\nYour name is " + name + " " + surname + ". Your DOB is " + dob + ", and you live " + distance + " kilometers from your favourite shop. You are " + age + " years old.\n");

		System.out.println("Distance of the shop in miles is: " + distance_in_miles);

		System.out.println("\nDistance of the shop in meters is: " + distance_in_meters);
		System.out.println("\nYour age in seconds is: " + age_in_seconds);
		System.out.println("\nYour age in milliseconds is: " + age_in_milliseconds);
		System.out.println("\nYour age in hexadecimals is: " + age_in_hexadecimal);
		System.out.println("\nYour age in binary is: " + age_in_binary);
	}
}