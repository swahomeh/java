import java.util.Random;

public class Array2D_2 {
    public static void main(String[] args) {
        int i, j, k, l, m;
        int [][] array = new int[100][30];
       
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++)
                array[a][b] = random.nextInt(100) + 1;
        }                 

        System.out.println ("Array size: " + array.length + "\n");
        
        System.out.println("Array elements");
        for(i = 0; i < array.length; i++){           
            for(int q = 0; q < array[i].length; q++) {
                System.out.print(array[i][q] + ", ");
            }
        }        

        //Array elements ++1
        for (k = 0; k < array.length; k++) {            
            for (int s = 0; s < array[k].length; s++) {
                array[k][s] += 1;
            }
        }

        System.out.println("\n\nArray elements ++1");
        for(l = 0; l < array.length; l++){            
            for (int t = 0; t < array[l].length; t++) {
                System.out.print(array[l][t] + ", ");
            }
        }
    }
}