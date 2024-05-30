import java.util.*;
public class ArrayListTest6 {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<>();

      list.add("banana");
      list.add("home");
      list.add("world");
      list.add("ocean");

      System.out.println(list);

      System.out.println("\n");

      System.out.println("Get all elements from list:");
      for(int i = 0; i< list.size(); i++){
           System.out.println(list.get(i));
      }

   }

}