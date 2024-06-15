import java.util.*;
 public class Bsearch {
//     public static int sum(int[] arr) {
//         int sumArr = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sumArr += arr[i];
//         }
//         return sumArr;
//     }

//     public static boolean isFeasible(int[] book, int students, int maxPages) {
//         int numStudents = 1;
//         int currentSum = 0;
        
//         for (int pages : book) {
//             if (pages > maxPages) {
//                 return false; 
//             }
//             if (currentSum + pages > maxPages) {
//                 numStudents++;
//                 currentSum = pages;
//                 if (numStudents > students) {
//                     return false;
//                 }
//             } else {
//                 currentSum += pages;
//             }
//         }
//         return true;
//     }

//     public static int bookShare(int[] book, int students) {
//         if (book.length < students) {
//             return -1; 
//         }
        
//         int sumBooks = sum(book);
//         int maxPages = sumBooks;
//         int minPages = 0; 
//         int ans = -1;
        
//         while (minPages <= maxPages) {
//             int mid = (minPages + maxPages) / 2;
//             if (isFeasible(book, students, mid)) {
//                 ans = mid;
//                 maxPages = mid - 1;
//             } else {
//                 minPages = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] book = {10,20,3,40}; 
//         int students = 2; 
//         System.out.println(bookShare(book, students)); 
//     }
      public static boolean check(int[] arr, int pages, int s){
        int currStudent=1;
        int currSum=1;
        int cSum=0;
        for(int i: arr){
            if(cSum+i<=pages)
            cSum +=i;
            else{
                currStudent++;
                if(currStudent>s || i>pages)
                    return false;
                cSum=i;

            }
        }
      }
}