import java.util.Scanner;

public class CodeAlongCopy2 {

	public static void main (String[] args) {
		int[][] array = {{3,6,10,19,2,5,45,89,13,10},{11,6,27,19,13,49,57,22,98,78}};
		int rowIndex = 0;
		int columnIndex = 0;
		int[] cellArray = {};

		// print menu
		int userMenuInput = printMenu();
		System.out.println(userMenuInput);

		if (userMenuInput > 0 && userMenuInput <= 3)
			switch (userMenuInput) {
				case 1:
					rowIndex = promptRow(array);
					int[] row = getRow(array, rowIndex);

					if (row.length > 0)
						printRow(row, rowIndex);
					else
						System.out.println("Invalid row: Row " + rowIndex);

					break;
				case 2:
					columnIndex = promptColumn(array);
					int[] column = getColumn(array, columnIndex);
					if (column.length > 0)
						printColumn(column, columnIndex);
					else
						System.out.println("Invalid column: Column " + columnIndex);

					break;
				case 3:
					cellArray = promptCell(array);
					int cell = getCell(array, cellArray[0], cellArray[1]);
					if (cell > 0)
						System.out.println("\nCell: " + cell);
					else
						System.out.println("Invalid cell");
															
					break;
			}	
	}

	public static int getCell (int[][] array, int row, int column) {
		int noCell = 0;
		int cell = 0;

		for (int i = 0; i < array.length; i++)
			if (i == row)
				for (int j = 0; j < array[i].length; j++)
					if (j == column)
						cell = array[row][column];

		if (cell > 0)
			return cell;
		else
			return noCell;
	}

	public static int[] getRow (int[][] array, int rowIndex) {
		int[] noRow = {};

		if (rowIndex >= 0 && rowIndex < array.length)
			return array[rowIndex];
		else
			return noRow;
	}

    public static int[] getColumn(int[][] array, int columnIndex) {
        int[] column = new int[array.length];
        int[] noColumn = {};

        for (int i = 0; i < array.length; i++) {
        	for (int j = 0; j < array[i].length; j++)
	        	if (j == columnIndex)
	            	column[i] = array[i][columnIndex];
        }        

        if (column[0] > 0)
        	return column;
        else
        	return noColumn;
    }	

	public static void printRow (int[] row, int rowIndex) {
		System.out.print("\nRow " + rowIndex);
		System.out.print(": [");
			int count = 0;
			for (int value : row) {
				System.out.print(value);

				if(count != row.length - 1)
					System.out.print(",");
				count++;
			}
		System.out.print("]\n");
	}

	public static void printColumn (int[] column, int columnIndex) {
		System.out.print("\nColumn " + columnIndex);
		System.out.print(": [");
			int count = 0;
			for (int value : column) {
				System.out.print(value);

				if(count != column.length - 1)
					System.out.print(",");
				count++;
			}
		System.out.print("]\n");
	}

	public static int printMenu ()	{
		System.out.println("\n[*] Menu:\n");
		System.out.println("1. Get Row");
		System.out.println("2. Get Column");
		System.out.println("3. Get Cell");
		
		Scanner scanner = new Scanner(System.in);

		return Integer.parseInt(scanner.nextLine()); // string to int
	}

	public static int promptRow (int[][] array) {
		Scanner scanner = new Scanner(System.in);
		int rowIndex;

		while (true) {
			System.out.println("Please enter the row number:");

			rowIndex = scanner.nextInt();

			if (rowIndex >= 0 && rowIndex < array.length)
				break;
		}

		return rowIndex;
	}

	public static int promptColumn (int[][] array) {
		Scanner scanner = new Scanner(System.in);
		int columnIndex;		

		while (true) {
			System.out.println("Please enter the column number:");

			columnIndex = scanner.nextInt();

	       	for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++)
		        	if (j == columnIndex)
		            	return columnIndex;
	        }
		}		
	}

	public static int[] promptCell (int[][] array) {
		Scanner scanner = new Scanner(System.in);
		int rowIndex;
		int columnIndex;
		int[] cellNum = new int[array.length];

		while (true) {
			System.out.println("Please enter the row number:");

			rowIndex = scanner.nextInt();

			if (rowIndex >= 0 && rowIndex < array.length)
				break;
		}

		while (true) {
			System.out.println("Please enter the column number:");

			columnIndex = scanner.nextInt();

	       	for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++)
		        	if (j == columnIndex){
						cellNum[cellNum.length - 2] = rowIndex;
						cellNum[cellNum.length - 1] = columnIndex;		        		
		            	return cellNum;
		            }
	        }
		}
	}	
}