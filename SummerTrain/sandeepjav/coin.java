public class coin {
    static void coinFlip(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinFlip(n-1, ans+"H");
        coinFlip(n-1, ans+"T");
    }
    public static void main(String args[]){
        int n=5;
        coinFlip(2,"");
        // System.out.print();
    }
}


