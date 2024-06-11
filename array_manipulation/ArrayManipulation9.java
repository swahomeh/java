public class ArrayManipulation9 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        arrayA = sub( arrayA, arrayB);
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size a - duplicates
        //copy non-duplicates into the new array contigously.

        //define int duplicateCount = 0;
        //count duplicate and duplicateCount++ for each
        //create new array that is initialSize - duplicateCount;
        //write a loop that skips duplicate as it copies from a to b        
        
        // remove duplicates from a
        int duplicateCount = 0;
        for (int i = 0; i < arrayA.length; i++)
            for (int j = i + 1; j < arrayA.length; j++) // int j = i + 1; to check values not in the same index
                if (arrayA[i] == arrayA[j]) {
                    duplicateCount++;
                    break;
                }

        int index = 0;
        int[] newArray = new int[arrayA.length - duplicateCount];

        for (int j = 0; j < arrayA.length; j++) {
            boolean isDuplicate = false;
            for (int k = j + 1; k < arrayA.length; k++) {
                if (arrayA[j] == arrayA[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                newArray[index++] = arrayA[j];
        }


        // remove duplicates from b
        int duplicateCountB = 0;
        for (int i = 0; i < arrayB.length; i++)
            for (int j = i + 1; j < arrayB.length; j++)
                if (arrayB[i] == arrayB[j]) {
                    duplicateCountB++;
                    break;
                }

        int indexB = 0;
        int[] newArrayB = new int[arrayB.length - duplicateCountB];

        for (int j = 0; j < arrayB.length; j++) {
            boolean isDuplicate = false;
            for (int k = j + 1; k < arrayB.length; k++) {
                if (arrayB[j] == arrayB[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                newArrayB[indexB++] = arrayB[j];
        }

        // new set difference between arrayA and arrayB i.e subtract B from A (only values in A that are not in B)
        int count = 0;

        // get new set size - duplicates
        for (int value : newArray) {
            boolean isDuplicate = false;
            for (int i = 0; i < newArrayB.length; i++) {
                if (newArrayB[i] == value){
                    count++;
                    break;
                }
            }
        }

        int[] newSet = new int[newArray.length - count];
        int indexC = 0;

        // get set difference
        for (int value : newArray) {
            boolean isDuplicate = false;
            for (int i = 0; i < newArrayB.length; i++) {
                if (newArrayB[i] == value){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
                newSet[indexC++] = value;
        }

        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
        return newSet;
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