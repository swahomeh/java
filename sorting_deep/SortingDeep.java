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

		System.out.println("\n");
		quickSort(array, 0, array.length - 1);
		printer(array);
	}

	public static void quickSort (int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);

			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	public static int partition (int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) 
			if (array[j] >= pivot) { // if statement controls whether to sort in ascending or descending order
				i++;
				swap(array, i, j);
			}

		swap (array, i + 1, high);

		return i + 1;
	}

	public static void swap (int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
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