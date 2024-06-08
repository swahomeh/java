import java.util.Random;

public class Array1D_4 {
    public static void main(String[] args) {
        int [] arraynumbers = new int[50];
       
        Random random = new Random();
        for (int i = 0; i < arraynumbers.length; i++) {
            arraynumbers[i] = random.nextInt(100) + 1;
            
        }        

        System.out.println ("Array size: " + arraynumbers.length + "\n");
        
        System.out.println("Array elements (even):");
        for(int tempValue : arraynumbers){
            if (tempValue%2 == 0)
                System.out.print(tempValue + ", ");
        }

        System.out.println("\n\nArray elements (el%11==0):");
        for(int tempValue1 : arraynumbers){
            if (tempValue1%11 == 0)
                System.out.print(tempValue1 + ", ");
        }        

        // array elements ++1
        for (int j = 0; j < arraynumbers.length; j++) {
            arraynumbers[j] += 1;
        }

        System.out.println("\n\nArray elements ++1 (even):");
        for(int temp : arraynumbers){
            if (temp%2 == 0)
                System.out.print(temp + ", ");
        }

        System.out.println("\n\nArray elements ++1 (el%11==0):");
        for(int temp1 : arraynumbers){
            if (temp1%11 == 0)
                System.out.print(temp1 + ", ");
        }                
    }
}