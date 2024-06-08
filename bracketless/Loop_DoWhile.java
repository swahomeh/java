public class Loop_DoWhile {
	public static void main (String[] args) {
		int i = 0;

		do
			switch (i) {
				case 10:
					System.out.println(i + " is greater than 9");
					break;
				case 9:
					System.out.println(i + " is greater than 8");
					break;
				case 8:
					System.out.println(i + " is greater than 7");
					break;
				case 7:
					System.out.println(i + " is greater than 7");
					break;
				case 6:
					System.out.println(i + " is greater than 6");
					break;
				case 5:
					System.out.println(i + " is greater than 5");
					break;
				case 4:
					System.out.println(i + " is greater than 4");
					break;
				case 3:
					System.out.println(i + " is greater than 3");
					break;
				case 2:
					System.out.println(i + " is greater than 2");
					break;
				case 1:
					System.out.println(i + " is less than or equal to 1");
					break;
				default: 
					System.out.println(i + " is less than or equal to 1");
					break;
			}
		while (i++ < 10);
	}
}