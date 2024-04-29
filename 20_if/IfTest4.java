public class IfTest4 {
    public static void main(String[] args) {

        if(getA() || getB()){
            System.out.println("COOL");
        }
       
        System.out.println("Finished");
    }
   
    static boolean getA() {
        System.out.println("Fetching a.");
        return true;

    }
    static boolean getB() {
        System.out.println("Fetching b.");
        return true;

    }
}