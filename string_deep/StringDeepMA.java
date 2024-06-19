public class StringDeepMA {
	public static void main(String[] args) {
		String line = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n";

        // get rows
		String[] stringRows = line.split("\n");

		// get num of rows and columns
		int numRows = stringRows.length;
		int numCols = stringRows[0].split(",").length;

		// array to hold 2D array as integers
		int[][] array2D = new int[numRows][numCols];

		for (int i = 0; i < numRows; i++){
			String[] cols = stringRows[i].split(",");

			for (int j = 0; j < numCols; j++)
				array2D[i][j] = Integer.parseInt(cols[j].trim());
		}

		System.out.println("Ascending order");
		for (int i = 0; i < numRows; i++)
			quicksort(array2D[i], 0, numCols - 1, "asc");

		print (array2D);

		System.out.println("\n");

		System.out.println("Descending order");
		for (int i = 0; i < numRows; i++)
			quicksort(array2D[i], 0, numCols - 1, "desc");

		print (array2D);		
	}

	public static void quicksort (int[] array, int low, int high, String mode) {
		if (low < high) {
			int pivotIndex = partition(array, low, high, mode);

			quicksort(array, low, pivotIndex - 1, mode);
			quicksort (array, pivotIndex + 1, high, mode);
		}
	}

	public static int partition (int[] array, int low, int high, String mode) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++)
			switch (mode) {
				case "asc":
					if (array[j] <= pivot) {
						i++;
						swap(array, i, j);
					}
					break;
				case "desc":
					if (array[j] >= pivot) {
						i++;
						swap(array, i, j);
					}
					break;
			}

		swap(array, i + 1, high);

		return i + 1;
	}

	public static void swap (int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void print (int[][] array) {
		System.out.print("[");

		for (int i = 0; i < array.length; i++) {
			System.out.print("{");
			for (int j = 0; j < array[i].length; j++) {System.out.print(array[i][j]);

				if (j < array[i].length - 1)
					System.out.print(",");
			}
			System.out.print("}");
			if (i < array.length - 1)
				System.out.print(",");
		}

		System.out.print("]");
	}
}