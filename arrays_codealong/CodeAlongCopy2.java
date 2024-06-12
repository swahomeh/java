public class CodeAlongCopy2 {
	public static void main (String[] args) {
		int[][] array = {{3,6,10,19,2,5,45,89,13,10},{11,6,27,19,13,49,57,22,98,78}};

		int rowIndex = 1;

		int[] row = getRow(array, rowIndex);

		if (row.length > 0)
			printRow(row, rowIndex);
		else
			System.out.println("Invalid row: Row " + rowIndex);
	}

	public static int[] getRow (int[][] array, int row) {
		int[] noRow = {};

		if (row >= 0 && row < array.length)
			return array[row];
		else
			return noRow;

	}

	public static void printRow (int[] row, int rowIndex) {
		System.out.print("Row " + rowIndex);
		System.out.print(": [");
		// for (int i = 0; i < max.length; i++) {
			int count = 0;
			// System.out.print("{");
			for (int value : row) {
				System.out.print(value);

				if(count != row.length - 1)
					System.out.print(",");
				count++;
			}			
			// System.out.print("}");
			// if(i != max.lengtarray// }
		System.out.print("]\n");

	}	
}