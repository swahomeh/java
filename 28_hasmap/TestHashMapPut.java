import java.util.HashMap;
import java.util.Map;

public class TestHashMapPut {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Accessing values by key
        // System.out.println("Value for key 'apple': " + hashMap.get("apple"));

        // Removing a key-value pair
        // hashMap.remove("banana");

        // Checking if a key exists
        // System.out.println("Contains key 'banana': " + hashMap.containsKey("banana"));

        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}