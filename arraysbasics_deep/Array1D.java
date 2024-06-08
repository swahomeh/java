public class Array1D {
    public static void main(String[] args) {
        int [] arraynumbers = {23, 4, 7, 5, 40, 18, 33, 67, 55, 16, 3, 13, 46, 60, 56, 34, 27, 9, 6, 23, 65, 78, 90, 43, 13, 15, 16, 56, 76, 5, 9, 2, 1, 11, 55, 66, 34, 78, 89, 10, 19, 17, 38, 93, 81, 83, 77, 34, 98, 41};
       
        int i = 0;

        System.out.println ("Array size: " + arraynumbers.length + "\n");
        
        System.out.println("Array elements:");
        for(int tempValue : arraynumbers){
            System.out.print(tempValue + ", ");
        }

        System.out.println("\n\nArray elements (++1):");
        for (int temp : arraynumbers) {
            temp += 1;
            System.out.print(temp + ", ");
        }
    }
}