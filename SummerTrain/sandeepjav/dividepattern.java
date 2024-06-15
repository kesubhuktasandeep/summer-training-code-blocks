public class dividepattern {
    public static void main(String[] args) {
        int n=10;
        // for(int i=n; i>=1;i--){
        //     for(int k=1; k<=2*(n-i);k++)
        //     System.out.print(" ");
        // for(int j=1; j<=i;j++)
        // System.out.print("*");
        // System.out.println();
        // }
        //pattern left traingle
        // for (int i = n; i >= 1; i--) {
        //     for (int k = 1; k <= 2 * (n - i); k++)
        //         System.out.print(" ");
        //     for (int j = 1; j <= i; j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++)
                System.out.print(" _  "); 
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
    

