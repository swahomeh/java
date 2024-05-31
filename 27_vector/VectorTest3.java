import java.util.*;

public class VectorTest3 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");
           
            System.out.println(v);

        v.clear();

        System.out.println("\nEmpty vector:");
        System.out.println(v);
        
    }
}