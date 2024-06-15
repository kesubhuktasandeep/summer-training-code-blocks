// import java.util.*;

// class hashtable {
//     public static void main(String[] args) {
//         String[] arr = {"Gaurav", "Arpit", "Rahul", "Sachin"};
//         Map<Character, String> rollCall = new HashMap<>();

//         for (int i = 0; i < arr.length; i++) {
//             rollCall.put((char)(97 + i), arr[i]);
//         }

//         for (Map.Entry<Character, String> entry : rollCall.entrySet()) {
//             System.out.println("Roll number " + entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }
import java.util.*;

// class hashtable {
//     public static Map<Integer, Integer> countFrequency(int[] arr) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         return map;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};
//         Map<Integer, Integer> frequencyMap = countFrequency(arr);


//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
//         }
//     }
// }
public class hashtable {

    static void display(Map<Integer, Integer> map) {
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

    static void countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        display(map);
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElem = -1;
        int minElem = -1;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxElem = entry.getKey();
            }
            if (frequency < minFreq) {
                minFreq = frequency;
                minElem = entry.getKey();
            }
        }
        
        System.out.println("Element with max frequency: " + maxElem + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with min frequency: " + minElem + " (Frequency: " + minFreq + ")");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 5, 3, 6, 4, 7, 6, 8, 9, 7};
        countFrequency(arr);
    }
}