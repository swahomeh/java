public class ArrayChallenge361 {
	public static void main (String[] args) {
		double[][][] array3D = new double[10][10][3];
		double[][] array2D = new double[10][10];

		for (int i = 0; i < array3D.length; i++)
			for (int j = 0; j < array3D[i].length; j++)
				for (int k = 0; k < array3D[i][j].length; k++)
					array3D[i][j][k] = Math.random();

		for (int x = 0; x < array3D.length; x++){
			System.out.println ("3D Array Layer" + (x + 1) + ":");
			for (int y = 0; y < array3D[x].length; y++) {
				System.out.print("{ ");
				for (int z = 0; z < array3D[x][y].length; z++) {
					System.out.print(array3D[x][y][z] + " ");
				}
				System.out.print("}\n");
			}
			System.out.println();
		}

		for (int m = 0; m < array2D.length; m++)
			for (int n = 0; n < array2D[m].length; n++)
					array2D[m][n] = Math.random();

		for (int q = 0; q < array2D.length; q++){
			System.out.println ("2D Array Layer" + (q + 1) + ":");
			System.out.print("{ ");
			for (int r = 0; r < array2D[q].length; r++) {
				System.out.print(array2D[q][r] + " ");
			}
			System.out.print("}\n");
			System.out.println();
		}		
		
	}
}