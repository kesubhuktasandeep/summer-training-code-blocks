public class arrayc3 {
    // public static int findSmallestRoll(int[] roll) {
    //     if (roll.length == 0) {
    //         throw new IllegalArgumentException("Array is empty");
    //     }
    //     int smallest = roll[0];
    //     for(int i = 1; i < roll.length; i++) {
    //         if(roll[i] < smallest) {
    //             smallest = roll[i];
    //         }
    //     }
    //     return smallest;
    // }
    // public static int findSumOfRolls(int[] roll) {
    //     int sum = 0;
    //     for (int i = 0; i < roll.length; i++) {
    //         sum += roll[i];
    //     }
    //     return sum;
    // }
    public static int findSumInRange(int[] roll, int start, int end) {
        if (start < 0 || end >= roll.length || start > end) {
            throw new IllegalArgumentException("Invalid range");
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += roll[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] rollNumbers = {2, 5, 1, 4, 3};
        System.out.println(findSumInRange(rollNumbers ,1, 3)); 
    }
}

