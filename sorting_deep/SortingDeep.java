public class SortingDeep {
	public static void main (String[] args) {
		int[] array = new int[50];

		for (int i = 0; i < 50; i++)
			array[i] = (int)(Math.random() * 51);

		// System.out.print(array.length);

		printer(array);

		for (int i = 0; i < array.length; i++) {
			if (i == 19)
				array[i] += 20;

			if (i == 60)
				array[i] += 61;
		}

		System.out.println("\n");
		printer(array);
	}

	public static void printer(int[] array) {
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