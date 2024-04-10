import java.util.*; // Arrays, Collections, Comparator, List

public class ParamTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "world";
        String str3 = "How was the solar eclipse?";

        int int1 = 3;
        int int2 = 5;
        int int3 = 7;
        
        concatenateAndPrint(str1, str2, str3);
        intSum(int1, int2);
        intDifference(int1, int2);
        division(int1, int2);
        largestInt(int1, int2, int3);
        longestString(str1, str2, str3);
    }
    
    public static void concatenateAndPrint(String str1, String str2, String str3) {
        String concatenatedString = str1 + " " + str2 + ". " + str3;
        System.out.println("Concatenated String: " + concatenatedString);
    }

    public static void intSum( int int1, int int2) {
        int sum = int1 + int2;
        System.out.println("\nThe total sum is: " + sum);
    }

    public static void intDifference( int int1, int int2) {
        int difference = int1 - int2;
        System.out.println("\nThe difference is: " + difference);
    }

    public static void division( int int1, int int2) {
        float division = ((float) int2) / int1;
        System.out.println("\nThe quotient of " + int2 + "/"+ int1 + " is: " + division);
    }

    public static void largestInt( int int1, int int2, int int3) {
        List<Integer> intList = Arrays.asList(int1, int2, int3);
        int largest = Collections.max(intList);

        System.out.println("\nThe largest number between " + int2 + ", "+ int1 + " and " + int3 +" is: " + largest);
    }

    public static void longestString( String str1, String str2, String str3) {

        //int strL1 = str1.length();
        //int strL2 = str2.length();
        //int strL3 = str3.length();

        List<String> stringList = Arrays.asList(str1, str2, str3);
        String longestString = stringList.stream().max(Comparator.comparingInt(String::length)).orElse(null);

        if (longestString != null) {
            System.out.println("\nThe longest string is: " + longestString);
        }
    }                      
}