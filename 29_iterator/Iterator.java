import java.util.*;

public class Iterator {
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

        Iterator<String> iterator = v.iterator();

        System.out.println("\nv1 Iterator:");
        while (iterator.hasNext()) {
            String a = iterator.next();
            System.out.println(a);
        }
        
    }
}