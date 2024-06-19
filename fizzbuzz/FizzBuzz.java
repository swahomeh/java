public class FizzBuzz {
	public static void main (String[] args) {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++)
			nums[i] = i + 1;

		for (int i = 0; i < nums.length; i++)
			if ((nums[i]%3 == 0) && (nums[i]%5 == 0))
				System.out.println ("FizzBuzz");
			else if (nums[i]%3 == 0)
				System.out.println ("Fizz");
			else if (nums[i]%5 == 0)
				System.out.println ("Buzz");
			else
				System.out.println (nums[i]);

	}
}