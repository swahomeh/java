import java.util.*;

public class VectorTest10 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        Vector<String> v2 = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");

        v2.add("avocado");
        v2.add("mangoes");
        v2.add("pears");
           
        System.out.println(v);
        System.out.println("\n");
        System.out.println(v2);
        
        v.addAll(2, v2);

        String[] array = v.toArray(new String[0]);

        System.out.println("\nv to array:");
        for (String i : array)
            System.out.println(i);

        
    }
}