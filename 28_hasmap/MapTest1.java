import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, String> hashMap = new HashMap<>();
        // HashMap hashMap = new HashMap();
        
        // hashMap.put("key1", "A");
        // hashMap.put("key2", "B");
        // hashMap.put("key3", "C");
        // hashMap.put("key4", "D");
        // hashMap.put("key5", "E");
        // hashMap.put("key6", "F");

        hashMap.put("Kenya", "Nairobi");
        hashMap.put("Uganda", "Kampala");
        hashMap.put("Somalia", "Mogadishu");
        hashMap.put("Tanzania", "Daresalam");
        hashMap.put("Congo", "Kinshasa");
        hashMap.put("Egypt", "Cairo");
        hashMap.put("Tunisia", "Tunis");

        System.out.println(hashMap);
        
        // Set keySet = hashMap.keySet();      
        // Collection values = hashMap.values();

        // for (Map.Entry<String, String> entry : hashMap.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        // for (Object entryObj : hashMap.entrySet()) {
        //     // Cast entry to Map.Entry
        //     Map.Entry entry = (Map.Entry) entryObj;
        //     // Cast key and value to String
        //     String key = (String) entry.getKey();
        //     String value = (String) entry.getValue();

        //     System.out.println("Key: " + key + ", Value: " + value);
        // }        

    }
}