public class arrayc2 {
    public static int findRoll(int[] roll, int r){
        for(int i=0;i<roll.length;i++){
            if(roll[i] == r)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] rollNumbers = {2,5,1,4,3};
        System.out.println(findRoll(rollNumbers, 1));
    }
    
}
