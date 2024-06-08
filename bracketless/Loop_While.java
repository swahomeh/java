public class Loop_While {
	public static void main (String[] args) {
		int i = 0;

		while (i++ < 10)
			if (i > 9)
				System.out.println(i + " is greater than 9");
			else if (i > 9)
				System.out.println(i + " is greater than 8");
			else if (i > 8)
				System.out.println(i + " is greater than 7");
			else if (i > 7)
				System.out.println(i + " is greater than 7");
			else if (i > 6)
				System.out.println(i + " is greater than 6");
			else if (i > 5)
				System.out.println(i + " is greater than 5");
			else if (i > 4)
				System.out.println(i + " is greater than 4");
			else if (i > 3)
				System.out.println(i + " is greater than 3");
			else if (i > 2)
				System.out.println(i + " is greater than 2");
			else if (i > 1)
				System.out.println(i + " is greater than 1");
			else 
				System.out.println(i + " is less than or equal to 1");
	}
}