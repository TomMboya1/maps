package org.example;

import java.util.HashMap;
import java.util.Map;

    public class TestingClass {
        public static void main(String[] args) {
            // Create a HashMap that maps numbers from 1 to 5 with their respective English names
            Map<Integer, String> firstHashMap = new HashMap<>();
            firstHashMap.put(1, "One");
            firstHashMap.put(2, "Two");
            firstHashMap.put(3, "Three");
            firstHashMap.put(4, "Four");
            firstHashMap.put(5, "Five");

            // Create a HashMap that maps odd numbers from 1 to 9 with their respective Italian names
            Map<Integer, String> secondHashMap = new HashMap<>();
            secondHashMap.put(1, "Uno");
            secondHashMap.put(3, "Tre");
            secondHashMap.put(5, "Cinque");
            secondHashMap.put(7, "Sette");
            secondHashMap.put(9, "Nove");

            // Merge the secondHashMap into the firstHashMap
            for (Map.Entry<Integer, String> entry : secondHashMap.entrySet()) {
                firstHashMap.put(entry.getKey(), entry.getValue());
            }

            // Print the modified firstHashMap
            System.out.println("Modified firstHashMap: " + firstHashMap);

            // Print the values for keys 5, 6, 7, 8, and 9
            printValue(firstHashMap, 5);
            printValue(firstHashMap, 6);
            printValue(firstHashMap, 7);
            printValue(firstHashMap, 8);
            printValue(firstHashMap, 9);
        }

        private static void printValue(Map<Integer, String> map, int key) {
            // Check if the map contains the key
            if (map.containsKey(key)) {
                // Print the associated value
                System.out.println("Value for key " + key + ": " + map.get(key));
            } else {
                // Print "No associated value"
                System.out.println("No associated value for key " + key);
            }
        }
    }

