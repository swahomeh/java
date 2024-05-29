import java.util.*;
public class ArrayListTest8 {
   public static void main(String[] args) {
      List<Integer> a  = new ArrayList<Integer>(3);
      List<Integer> b  = new ArrayList<Integer>(3);

      a.add(1);
      a.add(2);
      a.add(3);
      b.add(4);
      b.add(5);
      b.add(6);

      b.addAll(3, a);

      for(int i = 0; i< b.size(); i++){
           System.out.println(b.get(i));
      }
   }

}