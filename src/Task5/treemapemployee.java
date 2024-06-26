package Task5;

import java.util.TreeMap;

public class treemapemployee {
    public static void main(String[] args) 
    {
        // Create a TreeMap to store details
        TreeMap<Integer, String> treemap = new TreeMap<>();

        // Add some employees
        treemap.put(101, "John");
        treemap.put(102, "Alice");
        treemap.put(103, "Bob");
        treemap.put(104, "Diana");

        // Print out the names of the employees in alphabetical order
        System.out.println("Employee names in alphabetical order:");

        // Sort values
        treemap.values().stream().sorted().forEach(System.out::println);
    }
}
