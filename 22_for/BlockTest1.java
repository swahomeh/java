public class BlockTest1 {
    public static void main(String[] args) {
        int a, b;
       
        {
           int i =1;
           a = i;
           System.out.println("Block 1 i = "+ i);
        }
       
        {
            int i =1;
            b = i;
            System.out.println("Block 2 i = "+ i);            
        }

        System.out.println("Sum: " + (a + b));
       
    }
}