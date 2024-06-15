public class arrayc8 {
    public static void SwapIt(String[] arr, int i1, int i2) {
        int temp = 0;
        for(int i=0; i<=arr.length-1;i++){
           String temp = arr[i1];
            arr[i1]=arr[i2];
            arr[i2] = temp;
            System.out.println(i+" ");
            
        }
    }
    public static void main(String[])     
}
