public class spacespattern {
    public static void main(String[] args) {
        int n =10;
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= (n - i); k++)
                System.out.print(" _ "); // print two spaces for each k
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}