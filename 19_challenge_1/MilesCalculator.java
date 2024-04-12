public class MilesCalculator {
	public static double milesCalculator (String distance) {
		double km = Double.parseDouble(distance);
		double miles = km * 0.6214;

		return miles;
	}
}