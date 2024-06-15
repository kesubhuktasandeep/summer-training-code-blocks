public class sum {
    // public static float mean(int[] arr) {
    //     int sum = 0;
    //     for(int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //     }
    //     return (float) sum / arr.length;
    // }
    public static float mean(int[] nums, int i) {
        if (i == 0) 
            return nums[i];
        return (mean(nums, i - 1) * i + nums[i]) / (float) (i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(mean(arr, arr.length - 1));
    }
}