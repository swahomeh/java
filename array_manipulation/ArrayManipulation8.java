public class ArrayManipulation8 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
        int[] mergedArray;
       
        printArray("arrayA before merging ",arrayA);
        printArray("arrayB before merging ",arrayB);
        mergedArray = merge( arrayA, arrayB);
        printArray("mergedArray ",mergedArray);

    }

    public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        //copy both array into the new array contigously.
        int newSize = arrayA.length + arrayB.length;

        int[] newArray = new int[newSize];

        // not copying 0 values 
        // if 0 values are needed in their rightful place you can use the traditional for loop
        int index = 0;
        for (int value : arrayA)
            if (value != 0)
                newArray[index++] = value;

        for (int value : arrayB)
            if (value != 0)
                newArray[index++] = value; // newArray[arrayA.length + j] = arrayB[j]; - this copies zero elements

        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return newArray;
    }
    
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }
}