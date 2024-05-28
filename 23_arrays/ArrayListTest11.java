import java.util.*;
public class ArrayListTest11 {
   public static void main(String[] args) {
      List<Integer> a  = new ArrayList<Integer>(3);
      List<Integer> b  = new ArrayList<>(3);

      a.add(10);
      a.add(2);
      a.add(3);
      a.add(4);

      b.add(4);
      b.add(10);
      b.add(3);

      b.addAll(0, a);

      Integer[] array = b.toArray(new Integer[0]);
      for (int i : array)
         System.out.println(i);
   }

}
