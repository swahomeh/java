public class ArrayPopulation5 {
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

        // initialization - zero padded for the first elements of the arrays
        for (int i = 0; i < byteArray.length; i++)
            if (i < 5)
                byteArray[i] = (byte)0;
            else
                byteArray[i] = (byte)i;
        for (int j = 0; j < shortArray.length; j++)
            if (j < 5)
                shortArray[j] = (short)0;
            else
                shortArray[j] = (short)j;
        for (int k = 0; k < intArray.length; k++)
            if (k < 5)
                intArray[k] = 0;
            else
                intArray[k] = k;
        for (int l = 0; l < longArray.length; l++)
            if (l < 5)
                longArray[l] = 0;
            else
                longArray[l] = l;
        for (int m = 0; m < floatArray.length; m++)
            if (m < 5)
                floatArray[m] = 0;
            else
                floatArray[m] = (float)m;
        for (int n = 0; n < doubleArray.length; n++)
            if(n < 5)
                doubleArray[n] = 0;
            else
                doubleArray[n] = n;
        for (int o = 0; o < charArray.length; o++)
            if (o < 5)
                charArray[o] = '0';
            else
                charArray[o] = (char)o;
        for (int p = 0; p < booleanArray.length; p++)
            if (p < 5)
                booleanArray[p] = false;
            else
                booleanArray[p] = true;
        for (int q = 0; q < stringArray.length; q++)
            if (q < 5)
                stringArray[q] = "0";
            else
                stringArray[q] = "" + 0; // String.valueOf(q)

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