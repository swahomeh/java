import java.util.Random;

public class ArrayChallenge362 {
	public static void main (String[] args) {
		int[] arrayEven = new int[100];
		int[] arrayOdd = new int[100];
		int[] arrayPrime = new int[100];

		int temp = 0;
		Random random = new Random();

		// even numbers
		for (int i = 0; i < arrayEven.length; i++) {
			temp = random.nextInt(100) + 1; // 100 inclusive

			for (; temp % 2 != 0; temp = random.nextInt(10) + 1); // while (temp%2 != 0) temp = random.nextInt(100) + 1;
			arrayEven[i] = temp;
		}

		System.out.println("Even numbers array:");
		for (int x = 0; x < arrayEven.length; x++)
			System.out.print(arrayEven[x] + " ");

		// odd numbers
		for (int i = 0; i < arrayOdd.length; i++) {
			temp = random.nextInt(100) + 1; // 100 inclusive

			for (; temp % 2 == 0; temp = random.nextInt(100) + 1);
			arrayOdd[i] = temp;
		}

		System.out.println("\nOdd numbers array:");
		for (int x = 0; x < arrayOdd.length; x++)
			System.out.print(arrayOdd[x] + " ");

		// prime numbers
		for (int i = 0; i < arrayPrime.length; i++) {
			temp = random.nextInt(100) + 1; // 100 inclusive

			for (; isPrime(temp) == false; temp = random.nextInt(100) + 1);
			arrayPrime[i] = temp;

		}		

		System.out.println("\nPrime numbers array:");
		for (int y = 0; y < arrayPrime.length; y++)
			System.out.print(arrayPrime[y] + " ");					
		
	}

   	static boolean isPrime(int n) {
        // edge case
        if (n <= 1)
            return false;
 
        // check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }	
}