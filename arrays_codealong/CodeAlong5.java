public class CodeAlong5 {
	public static void main (String[] args) {
		int[] array = {3,6,10,19,2,5,45,89,13,10,11,6,27,19,13,49,57,22,98,78,40,33,28,1,7};
		count(array);
	}

	public static void count (int[] array) {
		int i = 0;
		System.out.print("[");
		for (int value : array) {
			System.out.print(value);

			if(i != array.length - 1)
				System.out.print(",");
			i++;
		}
		System.out.print("]");
	}
}