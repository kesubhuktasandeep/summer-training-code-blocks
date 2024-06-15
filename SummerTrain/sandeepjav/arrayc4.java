public class arrayc4 {
    public static int findSumInRange(int[] roll, int start, int end) {
        int s =0;
        for(int i=0;i<roll.length;i++){
            s=s+roll[i];
        }
        return s;
    }
    public static void main(String[] args){
        int[] rollNumbers={1,2,3,4,5};
        String[] box={"pen","pencil","erase"};
        System.out.println(findSumInRange(rollNumbers, 1, 2));
    }
    
}
