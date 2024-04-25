public class Printer {
	public static void print (String name, String surname, String dob, String distance, int age, double distance_in_miles, double distance_in_meters, double age_in_seconds, double age_in_milliseconds, String age_in_hexadecimal, String age_in_binary) {

		System.out.println("\n ********************************************* \n");

		System.out.println("\n[*] Your name is " + name + " " + surname + ". Your DOB is " + dob + ", and you live " + distance + " kilometers from your favourite shop. You are " + age + " years old.\n");

		System.out.println(" > Distance of the shop in miles: " + distance_in_miles);

		System.out.println("\n > Distance of the shop in meters: " + distance_in_meters);
		System.out.println("\n > Your age in seconds: " + age_in_seconds);
		System.out.println("\n > Your age in milliseconds: " + age_in_milliseconds);
		System.out.println("\n > Your age in hexadecimals: " + age_in_hexadecimal);
		System.out.println("\n > Your age in binary: " + age_in_binary);
	}
}