public class squarepattern {
    public static void main(String[] args) {
        //int n = 6;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows || i == j || j == (rows - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}