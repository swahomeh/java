import java.util.Random;

public class Array2D {
    public static void main(String[] args) {
        int a = 0, i = 0, j = 0, k = 0, l = 0, m = 0;
        int [][] array = new int[100][30];
       
        Random random = new Random();
        // for (int a = 0; a < array.length; a++) {
        //     for (int b = 0; b < array[a].length; b++)
        //         array[a][b] = random.nextInt(100) + 1;
        // }
        while (a < array.length) {
            int b = 0;
            while (b < array[a].length) {
                array[a][b] = random.nextInt(100) + 1;
                b++;
            }
            a++;
        }                  

        System.out.println ("Array size: " + array.length + "\n");
        
        System.out.println("Array elements (odd):");
        while(i < array.length){
            int q = 0;
            while(q < array[i].length) {
                switch (array[i][q]%2){
                    case (0):
                        q++;
                        continue;
                    default:
                        System.out.print(array[i][q] + ", ");
                }
                q++;
            }
            i++;
        }

        System.out.println("\n\nArray elements (el%8 == 0):");
        while(j < array.length){
            int r = 0;
            while (r < array[j].length){
                switch (array[j][r]%8){
                    case (0):
                        System.out.print(array[j][r] + ", ");
                }
                r++;
            }
            j++;
        }        

        //Array elements ++1
        while (k < array.length) {
            int s = 0;
            while (s < array[k].length) {
                array[k][s] += 1;
                s++;
            }
            k++;
        }

        System.out.println("\n\nArray elements (++1 odd):");
        while(l < array.length){
            int t = 0;
            while(t < array[l].length) {
                switch (array[l][t]%2) {
                    case (0):
                        t++;
                        continue;
                    default:
                        System.out.print(array[l][t] + ", ");
                }
                t++;
            }
            l++;
        }

        System.out.println("\n\nArray elements (++el%8 == 0):");
        while(m < array.length){
            int u = 0;
            while(u < array[m].length) {
                switch (array[m][u]%8) {
                    case (0):
                        System.out.print(array[m][u] + ", ");
                }
                u++;
            }
            m++;
        }
    }
}