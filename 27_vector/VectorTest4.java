import java.util.*;

public class VectorTest4 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");
           
            System.out.println(v);

        System.out.println("\nSize of vector:");
        System.out.println(v.size());
        
    }
}