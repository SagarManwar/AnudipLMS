package CollectionAssignment;

import java.util.HashMap;

public class CollectionAssignment1 {
    public static void main(String[] args) {
        // Initialize a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);
    }
}
