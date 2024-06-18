public class SortingDeep {
	public static void main (String[] args) {
		int[] array = new int[50];

		for (int i = 0; i < 50; i++)
			array[i] = (int)(Math.random() * 51);

		// System.out.print(array.length);

		int count = 0;
		System.out.print("[");
		for (int value : array) {
			System.out.print(value);

			if (count < array.length - 1)
				System.out.print(",");

			count++;

		}
		System.out.print("]");
	}
}