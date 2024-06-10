public class ArrayPopulation3 {
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

        for (int i = 0; i < byteArray.length; i++)
            byteArray[i] = (byte)i;
        for (int j = 0; j < byteArray.length; j++)
            shortArray[j] = (short)j;
        for (int k = 0; k < byteArray.length; k++)
            intArray[k] = k;
        for (int l = 0; l < byteArray.length; l++)
            longArray[l] = l;
        for (int m = 0; m < byteArray.length; m++)
            floatArray[m] = (float)m;
        for (int n = 0; n < byteArray.length; n++)
            doubleArray[n] = (double)n;
        for (int o = 0; o < byteArray.length; o++)
            charArray[o] = (char)o;
        for (int p = 0; p < byteArray.length; p++)
            if (p % 2 == 0)
                booleanArray[p] = true;
            else
                booleanArray[p] = false;
        for (int q = 0; q < byteArray.length; q++)
            stringArray[q] = "" + q; // String.valueOf(q)

        printArray("Byte array: ",byteArray); // (Object) byteArray - type casting here
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