public class StringDeep {
	public static void main(String[] args) {
		String line = "1,4,3,2,3,7,5,6,9";

		String[] lineElements = line.split(",");

		// array to hold elements as integers
		int[] numbers = new int[lineElements.length];

		for (int i = 0; i < lineElements.length; i++)
			numbers[i] = Integer.parseInt(lineElements[i].trim());

		quicksort(numbers, 0, numbers.length - 1);

		print (numbers);
	}

	public static void quicksort (int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);

			quicksort(array, low, pivotIndex - 1);
			quicksort (array, pivotIndex + 1, high);
		}
	}

	public static int partition (int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++)
			if (array[j] >= pivot) {
				i++;
				swap(array, i, j);
			}

		swap(array, i + 1, high);

		return i + 1;
	}

	public static void swap (int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void print (int[] array) {
		System.out.print("[");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1)
				System.out.print(",");
		}

		System.out.print("]");
	}
}