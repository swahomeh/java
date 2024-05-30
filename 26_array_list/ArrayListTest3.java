import java.util.*;
public class ArrayListTest3 {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<>();

      list.add("banana");
      list.add("home");
      list.add("world");
      list.add("ocean");

      System.out.println(list);

      System.out.println("\n");

      list.clear();

      System.out.println("Empty list:");
      System.out.println(list);
      // for(int i = 0; i< src.size(); i++){
      //      System.out.println(list.get(i));
      // }

   }

}