import java.util.Random;

public class Array2D_3 {
    public static void main(String[] args) {
        int i, j, k, l, m;
        int [][] array = new int[100][30];
       
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++)
                array[a][b] = random.nextInt(100) + 1;
        }                 

        System.out.println ("Array size: " + array.length + "\n");
        
        System.out.println("Array elements (odd):");
        for(i = 0; i < array.length; i++){           
            for(int q = 0; q < array[i].length; q++) {
                if (array[i][q]%2 != 0)
                    System.out.print(array[i][q] + ", ");
            }
        }

        System.out.println("\n\nArray elements (el%8 == 0):");
        for(j = 0; j < array.length; j++){            
            for (int r = 0; r < array[j].length; r++){
                if (array[j][r]%11 == 0)
                    System.out.print(array[j][r] + ", ");
            }
        }        

        //Array elements ++1
        for (k = 0; k < array.length; k++) {            
            for (int s = 0; s < array[k].length; s++) {
                array[k][s] += 1;
            }
        }

        System.out.println("\n\nArray elements (++1 odd):");
        for(l = 0; l < array.length; l++){            
            for (int t = 0; t < array[l].length; t++) {
                if (array[l][t]%2 != 0)
                    System.out.print(array[l][t] + ", ");
            }
        }

        System.out.println("\n\nArray elements (++el%8 == 0):");
        for(m = 0; m < array.length; m++){            
            for (int u = 0; u < array[m].length; u++) {
                if (array[m][u]%8 == 0)
                    System.out.print(array[m][u] + ", ");
            }
        }
    }
}