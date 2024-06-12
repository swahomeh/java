public class CodeAlong6 {
	public static void main (String[] args) {
		int[][] max = {{3,6,10,19,2,5,45,89,13,10},{11,6,27,19,13,49,57,22,98,78}};
		count(max);
	}

	public static void count (int[][] max) {

		System.out.print("[");
		for (int i = 0; i < max.length; i++) {
			int count = 0;
			System.out.print("{");
			for (int value : max[i]) {
				System.out.print(value);

				if(count != max[i].length - 1)
					System.out.print(",");
				count++;
			}			
			System.out.print("}");
			if(i != max.length - 1)
				System.out.print(",");
		}
		System.out.print("]");
	}
}