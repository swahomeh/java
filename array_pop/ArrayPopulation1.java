public class ArrayPopulation1 {
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
    
    public static void printArray(String prefix, Object arrayToPrint){ // int[] arrayToPrint
        System.out.print(prefix);
        System.out.print("[");

        // handle different array types // alternatives: if (arrayToPrint instanceof datatype[]){...}, or use overloaded method 'printArray(String prefix, datatype[] arrayToPrint)' for the different data types
        switch (arrayToPrint.getClass().getSimpleName()) {
            case "int[]":
                int[] intArray = (int[]) arrayToPrint;
                for (int i = 0; i < intArray.length; i++) {
                    System.out.print(intArray[i]);
                    if (i != intArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "byte[]":
                byte[] byteArray = (byte[]) arrayToPrint;
                for (int i = 0; i < byteArray.length; i++) {
                    System.out.print(byteArray[i]);
                    if (i != byteArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "short[]":
                short[] shortArray = (short[]) arrayToPrint;
                for (int i = 0; i < shortArray.length; i++) {
                    System.out.print(shortArray[i]);
                    if (i != shortArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "long[]":
                long[] longArray = (long[]) arrayToPrint;
                for (int i = 0; i < longArray.length; i++) {
                    System.out.print(longArray[i]);
                    if (i != longArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "float[]":
                float[] floatArray = (float[]) arrayToPrint;
                for (int i = 0; i < floatArray.length; i++) {
                    System.out.print(floatArray[i]);
                    if (i != floatArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "double[]":
                double[] doubleArray = (double[]) arrayToPrint;
                for (int i = 0; i < doubleArray.length; i++) {
                    System.out.print(doubleArray[i]);
                    if (i != doubleArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "char[]":
                char[] charArray = (char[]) arrayToPrint;
                for (int i = 0; i < charArray.length; i++) {
                    System.out.print(charArray[i]);
                    if (i != charArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "boolean[]":
                boolean[] booleanArray = (boolean[]) arrayToPrint;
                for (int i = 0; i < booleanArray.length; i++) {
                    System.out.print(booleanArray[i]);
                    if (i != booleanArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            case "String[]":
                String[] stringArray = (String[]) arrayToPrint;
                for (int i = 0; i < stringArray.length; i++) {
                    System.out.print(stringArray[i]);
                    if (i != stringArray.length - 1) {
                        System.out.print(",");
                    }
                }
                break;
            default:
                break;
        }        

        System.out.print("]\n");
    }
}