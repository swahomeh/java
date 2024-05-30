import java.util.*;
public class ArrayListTest9 {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<>();
      ArrayList<String> list2  = new ArrayList<>();

      list.add("banana");
      list.add("home");
      list.add("euro");
      list.add("world");
      list.add("ocean");     

      System.out.println(list);

      System.out.println("\n");  

      // Obtain an iterator for the ArrayList
      Iterator<String> iterator = list.iterator();

      // Iterate through the elements using the iterator
      System.out.println("Elements in the ArrayList:");
      while (iterator.hasNext()) {
         String el = iterator.next();
         System.out.println(el);
      }

   }

}