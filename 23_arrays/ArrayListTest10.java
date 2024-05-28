import java.util.*;
public class ArrayListTest10 {
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

      if (a.containsAll(b))
         for (int i = 0; i<a.size(); i++)
            System.out.println(a.get(i));
   }

}