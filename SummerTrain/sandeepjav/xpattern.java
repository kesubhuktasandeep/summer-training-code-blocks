public class xpattern {
    public static void main(String[] args) {
        int n = 10;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (j == i || j == n - i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
