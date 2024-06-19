public class Fibonacci {
	public static void main (String[] args) {

        int n = 10; // range
        int temp1 = 0; // first num in sequence
        int temp2 = 1; // second num in sequence

        System.out.println("Fibonacci sequence from 1 to " + n);

        System.out.print(temp1 + " "); // first fibonacci number

        for (int i = 2; i <= n; i++) {
            System.out.print(temp2 + " "); // current fibonacci number

            // next fibonacci number
            int next = temp1 + temp2;
            temp1 = temp2;
            temp2 = next;
        }		

	}
}