public class test6 {
    public static void printDscItr(int n,int i){
        if(i==n)return;
        printDscItr(n, i);
        System.out.println(i);
    }
}
