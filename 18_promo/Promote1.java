public class Promote1{
    public static void main(String[] args) {
        byte a = 5;
        short b = 2;
        int c = a + b; // type changed from byte to int (operands implicitly promoted to int)
        System.out.println(c);
    }
}