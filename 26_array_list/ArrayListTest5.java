import java.util.*;
public class ArrayListTest5 {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<>();

      list.add("banana");
      list.add("home");
      list.add("world");
      list.add("ocean");

      System.out.println(list);

      System.out.println("\n");

      // list.clear();
      String a = "world";
      System.out.println(a + " contained in list:");
      System.out.println(list.contains(a));
      // for(int i = 0; i< src.size(); i++){
      //      System.out.println(list.get(i));
      // }

   }

}