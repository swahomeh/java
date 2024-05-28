import java.util.*;
public class ArrayListTest4 {
   public static void main(String[] args) {
      List<String> src  = new ArrayList<>();

      src.add("Home");
      src.add("World");
      src.add("Ocean");

      for(int i = 0; i< src.size(); i++){
           System.out.println(src.get(i));
      }

      // src.clear();
      // System.out.println("\nArrayList Size:" + src.size());

      // for(int i = 0; i< src.size(); i++){
      //      System.out.println(src.get(i));
      // }

      // String a = "Ocean";
      // if (src.contains(a))
      //    System.out.println("ArrayList contains: " + a);

   }

}