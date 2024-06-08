public class Array1D_3 {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0, m = 0;
        int [] arraynumbers = {23, 4, 7, 5, 40, 18, 33, 67, 55, 16, 3, 13, 46, 60, 56, 34, 27, 9, 6, 23, 65, 78, 90, 43, 13, 15, 16, 56, 76, 5, 9, 2, 1, 11, 55, 66, 34, 78, 89, 10, 19, 17, 38, 93, 81, 83, 77, 34, 98, 41};


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