import java.util.*;
public class ArrayListTest8 {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<>();
      ArrayList<String> list2  = new ArrayList<>();

      list.add("banana");
      list.add("home");
      list.add("euro");
      list.add("world");
      list.add("ocean");

      list2.add("banana");
      list2.add("euro");
      list2.add("world");      

      System.out.println(list);

      System.out.println("\n");

      System.out.println(list2);   

      System.out.println("List contains all from list1:");
      System.out.println(list.containsAll(list2));

   }

}