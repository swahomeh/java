import java.util.*;

public class VectorTest2 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("mangoes");
        v.add("pears");
        v.add("plums");
        v.add("avocado");
           
            System.out.println(v);

        v.remove("pears");

        System.out.println("\n");
        System.out.println(v);
        
    }
}