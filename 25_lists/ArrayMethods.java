import java.util.*;
public class ArrayMethods {
   public static void main(String[] args) {
      List<String> src  = new ArrayList<>();

      src.add("Home");
      src.add("World");
      src.add("Ocean");

      for(int i = 0; i< src.size(); i++){
           System.out.println(src.get(i));
      }

   }

}