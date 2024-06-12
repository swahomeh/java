public class CodeAlongCopy {
	public static void main (String[] args) {
		int[] source = new int[100];
		
		int size = 31-15+1; // last index inclusive
		int[] dest = new int[size];

		for (int i = 0; i < source.length; i++)
			source[i] = (int)(Math.random() * 101); // 100 inclusive

		System.arraycopy(source, 15, dest, 0, size);

		print(dest);
	}

	public static void print (int[] array) {

		System.out.print("[");
		// for (int i = 0; i < max.length; i++) {
			int count = 0;
			// System.out.print("{");
			for (int value : array) {
				System.out.print(value);

				if(count != array.length - 1)
					System.out.print(",");
				count++;
			}			
			// System.out.print("}");
			// if(i != max.lengtarray// }
		System.out.print("]");
	}
}