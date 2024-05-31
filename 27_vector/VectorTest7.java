import java.util.*;

public class VectorTest7 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        Vector<String> v2 = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");

        v2.add("grape");
        v2.add("orange");
        v2.add("peach");
        v2.add("lemon");
        v2.add("pawpaw");
           
        System.out.println(v);
        System.out.println("\n");
        System.out.println(v2);
        
        v.addAll(2, v2);

        System.out.println("\nv2 added to v:");
        System.out.println(v);
        
    }
}