import java.util.*;
public class ArrayListTest9 {
   public static void main(String[] args) {
      List<Integer> a  = new ArrayList<Integer>(3);
      List<Integer> b  = new ArrayList<Integer>(3);

      a.add(10);
      a.add(2);
      a.add(3);
      a.add(4);

      b.add(4);
      b.add(10);
      b.add(3);

      System.out.println(a.containsAll(b));
   }

}