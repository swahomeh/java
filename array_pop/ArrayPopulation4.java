public class ArrayPopulation4 {
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

        // initialization
        for (int i = 0; i < byteArray.length; i++)
            byteArray[i] = -1;
        for (int j = 0; j < shortArray.length; j++)
            shortArray[j] = -1;
        for (int k = 0; k < intArray.length; k++)
            intArray[k] = -1;
        for (int l = 0; l < longArray.length; l++)
            longArray[l] = -1;
        for (int m = 0; m < floatArray.length; m++)
            floatArray[m] = -1f;
        for (int n = 0; n < doubleArray.length; n++)
            doubleArray[n] = -1;
        for (int o = 0; o < charArray.length; o++)
            charArray[o] = (char)-1;
        for (int p = 0; p < booleanArray.length; p++)
            booleanArray[p] = true;
        for (int q = 0; q < stringArray.length; q++)
            stringArray[q] = "" + -1; // String.valueOf(q)

        printArray("Byte array: ",byteArray);
        printArray("Short array: ",shortArray);
        printArray("Int array: ",intArray);
        printArray("Long array: ",longArray);
        printArray("Float array: ",floatArray);
        printArray("Double array: ",doubleArray);
        printArray("Char array: ",charArray);
        printArray("Boolean array: ",booleanArray);
        printArray("String array: ",stringArray);       

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