import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the ArrayList: ");
        int n = scanner.nextInt();


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        
        Collections.sort(arrayList);
t
        int smallestElement = arrayList.get(0);
        int largestElement = arrayList.get(arrayList.size() - 1);

       
        int sumOfElements = 0;
        for (int element : arrayList) {
            sumOfElements += element;
        }

        
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Smallest element: " + smallestElement);
        System.out.println("Largest element: " + largestElement);
        System.out.println("Sum of elements: " + sumOfElements);

        scanner.close();
    }
}
