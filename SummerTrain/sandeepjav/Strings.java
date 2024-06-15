public class Strings {
    // Palindrome Functions --------------------------------
    // public static boolean isPalindrome(String s) {
    //     int i =0;
    //     int j = s.length()-1;
    //     while(i<j) {
    //         if(s.charAt(i) != s.charAt(j)) {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    // Find the Longest Good subString in a string
    public static void isGoodSubString(String s){
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void main(String[] args) {
        // String s1 = "Table";
        // System.out.println(s1.substring(2, 4));
        // System.out.println(isPalindrome("madam"));"
        String s1 = "arrays";
        isGoodSubString(s1);
    }
}