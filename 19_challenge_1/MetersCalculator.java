public class MetersCalculator {
	public static double metersCalculator (String distance) {
		double distance_in_km = Double.parseDouble(distance);
		double distance_in_meters = distance_in_km * 1000;

		return distance_in_meters;
	}
}