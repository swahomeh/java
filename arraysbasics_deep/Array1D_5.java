import java.util.Random;

public class Array1D_5 {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0, m = 0;
        int [] arraynumbers = new int[50];
       
        Random random = new Random();
        for (int a = 0; a < arraynumbers.length; a++) {
            arraynumbers[a] = random.nextInt(100) + 1;            
        }        

        System.out.println ("Array size: " + arraynumbers.length + "\n");
        
        System.out.println("Array elements (even):");
        while(i < arraynumbers.length){
            switch (arraynumbers[i]%2){
                case (0):
                    System.out.print(arraynumbers[i] + ", ");
            }
            i++;
        }

        System.out.println("\n\nArray elements (el%11 == 0):");
        while(j < arraynumbers.length){
            switch (arraynumbers[j]%11){
                case (0):
                    System.out.print(arraynumbers[j] + ", ");
            }
            j++;
        }        

        //Array elements ++1
        while (k < arraynumbers.length) {
            arraynumbers[k] += 1;
            k++;
        }

        System.out.println("\n\nArray elements (++1 even):");
        while(l < arraynumbers.length){
            switch (arraynumbers[l]%2) {
                case (0):
                    System.out.print(arraynumbers[l] + ", ");
            }
            l++;
        }

        System.out.println("\n\nArray elements (++el%11 == 0):");
        while(m < arraynumbers.length){
            switch (arraynumbers[m]%11) {
                case (0):
                    System.out.print(arraynumbers[m] + ", ");
            }
            m++;
        }
    }
}