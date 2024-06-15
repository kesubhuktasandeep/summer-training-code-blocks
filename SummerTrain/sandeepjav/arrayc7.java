public class arrayc7 {
   public static void lastIx(int[] roll, int key){
    int idx = -1;
    for(int i=0;i<roll.length;i++){
        if(roll[i] == key){
            idx =i;
       
        }
      
    }
    syso(idx);
    return;
   }
   public static void main(String[] args) {
    int[] rollNumbers = {2, 5, 1, 4, 3};
    printKey(rollNumbers, 3);
}


}
