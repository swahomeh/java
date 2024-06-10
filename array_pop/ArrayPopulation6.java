public class ArrayPopulation6 {
    public static void main(String[]args){
        byte[] byteArray = new byte[10];
        short[] shortArray = new short[10];
        int[] intArray = new int[10];
        long[] longArray = new long[10];
        float[] floatArray = new float[10];
        double[] doubleArray = new double[10];
        char[] charArray = new char[10];
        boolean[] booleanArray = new boolean[10];
        String[] stringArray = new String[10];

        byte[] byteArrayDest = new byte[10];
        short[] shortArrayDest = new short[10];
        int[] intArrayDest = new int[10];
        long[] longArrayDest = new long[10];
        float[] floatArrayDest = new float[10];
        double[] doubleArrayDest = new double[10];
        char[] charArrayDest = new char[10];
        boolean[] booleanArrayDest = new boolean[10];
        String[] stringArrayDest = new String[10];        

        // initialization - zero padded for the first elements of the arrays
        for (int i = 0; i < byteArray.length; i++)
            byteArray[i] = (byte)(i + 20);
        for (int j = 0; j < shortArray.length; j++)
            shortArray[j] = (short)(j + 20);
        for (int k = 0; k < intArray.length; k++)
            intArray[k] = k + 20;
        for (int l = 0; l < longArray.length; l++)
            longArray[l] = l + 20;
        for (int m = 0; m < floatArray.length; m++)
            floatArray[m] = m + 20;
        for (int n = 0; n < doubleArray.length; n++)
            doubleArray[n] = n + 20;
        for (int o = 0; o < charArray.length; o++)
            charArray[o] = (char)(o + 20);
        for (int p = 0; p < booleanArray.length; p++)
            booleanArray[p] = true;
        for (int q = 0; q < stringArray.length; q++)
            stringArray[q] = "" + (q + 20); // String.valueOf(q)

        // before copy
        printArray("Source Byte before copy: ",byteArray);
        printArray("Source Short before copy: ",shortArray);
        printArray("Source Int before copy: ",intArray);
        printArray("Source Long before copy: ",longArray);
        printArray("Source Float before copy: ",floatArray);
        printArray("Source Double before copy: ",doubleArray);
        printArray("Source Char before copy: ",charArray);
        printArray("Source Boolean before copy: ",booleanArray);
        printArray("Source String before copy: ",stringArray);

        System.out.println();

        printArray("Dest Byte before copy: ",byteArrayDest);
        printArray("Dest Short before copy: ",shortArrayDest);
        printArray("Dest Int before copy: ",intArrayDest);
        printArray("Dest Long before copy: ",longArrayDest);
        printArray("Dest Float before copy: ",floatArrayDest);
        printArray("Dest Double before copy: ",doubleArrayDest);
        printArray("Dest Char before copy: ",charArrayDest);
        printArray("Dest Boolean before copy: ",booleanArrayDest);
        printArray("Dest String before copy: ",stringArrayDest); 

        // copy from source to destination arrays
        for (int i = 0; i < byteArray.length; i++)
            byteArrayDest[i] = byteArray[i];
        for (int j = 0; j < shortArray.length; j++)
            shortArrayDest[j] = shortArray[j];
        for (int k = 0; k < intArray.length; k++)
            intArrayDest[k] = intArray[k];
        for (int l = 0; l < longArray.length; l++)
            longArrayDest[l] = longArray[l];
        for (int m = 0; m < floatArray.length; m++)
            floatArrayDest[m] = floatArray[m];
        for (int n = 0; n < doubleArray.length; n++)
            doubleArrayDest[n] = doubleArray[n];
        for (int o = 0; o < charArray.length; o++)
            charArrayDest[o] = charArray[o];
        for (int p = 0; p < booleanArray.length; p++)
            booleanArrayDest[p] = booleanArray[p];
        for (int q = 0; q < stringArray.length; q++)
            stringArrayDest[q] = stringArray[q];

        // after copy
        System.out.println();
                
        printArray("Source Byte after copy: ",byteArray);
        printArray("Source Short after copy: ",shortArray);
        printArray("Source Int after copy: ",intArray);
        printArray("Source Long after copy: ",longArray);
        printArray("Source Float after copy: ",floatArray);
        printArray("Source Double after copy: ",doubleArray);
        printArray("Source Char after copy: ",charArray);
        printArray("Source Boolean after copy: ",booleanArray);
        printArray("Source String after copy: ",stringArray);

        System.out.println();

        printArray("Dest Byte after copy: ",byteArrayDest);
        printArray("Dest Short after copy: ",shortArrayDest);
        printArray("Dest Int after copy: ",intArrayDest);
        printArray("Dest Long after copy: ",longArrayDest);
        printArray("Dest Float after copy: ",floatArrayDest);
        printArray("Dest Double after copy: ",doubleArrayDest);
        printArray("Dest Char after copy: ",charArrayDest);
        printArray("Dest Boolean after copy: ",booleanArrayDest);
        printArray("Dest String after copy: ",stringArrayDest);         

    }
    
    // using overloaded methods
    public static void printArray(String prefix, byte[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, short[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }
    
    public static void printArray(String prefix, long[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, float[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, double[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, char[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, boolean[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

    public static void printArray(String prefix, String[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i != arrayToPrint.length - 1) {
                System.out.print(",");
            }
        }      

        System.out.print("]\n");
    }

}