public class arrayc5 {
    public static int searchroll(int[] roll,int item){
        for(int i=0;i<roll.length;i++){
            if(roll[i]==item) return i;
        }
        return -1;
    }

    public static int larg_no(int[] roll){

        int largest_no=0;
        for(int i=0;i<roll.length;i++){
            if(largest_no<roll[i]){
                largest_no = roll[i];
            }
            else continue;
           

        }

        return largest_no;
    }


    public static int smal_no(int[] roll){

        int smal_no=0;
        for(int i=0;i<roll.length;i++){
            if(smal_no>roll[i]){
                smal_no = roll[i];
            }
            else continue;
           

        }

        return smal_no;
    }

    public static int sum(int[] roll){
        int s=0;
        for(int i=0;i<roll.length;i++){
            s=s+roll[i];
    }
    return s;
}
public static int findSumrange(int[] roll,int st,int en){
    int s=0;
    for (int i=st;i<en;i++) {
        s=s+roll[i];
    }
    return s;
}
public static int find_larg_range(int[] roll,int st,int en){
    int s=0;
    for (int i=st;i<en;i++) {
        s=s+roll[i];
    }
    return s;
}
public static int find_smal_range(int[] roll,int st,int en){
    int s=0;
    for (int i=st;i<en;i++) {
        s=s+roll[i];
    }
    return s;
}

    public static void main(String[] args){
        int[] rollNumbers={1,2,3,4,5};
        System.out.println(searchroll(rollNumbers,1));
        System.out.println(larg_no(rollNumbers));
        System.out.println(smal_no(rollNumbers));
        System.out.println(sum(rollNumbers));
        System.out.println(findSumrange(rollNumbers,1,2));
        System.out.println(find_larg_range(rollNumbers,1,3));
        System.out.println(find_smal_range(rollNumbers,1,3));
    }
    
}