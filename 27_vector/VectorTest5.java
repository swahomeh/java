import java.util.*;

public class VectorTest5 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");
           
            System.out.println(v);

            String a = "mangoes";
        System.out.println("\nVector contains: " + a);
        System.out.println(v.contains(a));
        
    }
}