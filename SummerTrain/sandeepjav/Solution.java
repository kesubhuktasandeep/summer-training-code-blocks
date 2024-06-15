public class Solution {
    int res = 0;

    public int splitArray(int[] nums, int k) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int i : nums) {
            max += i;
            min = Math.max(min, i);
        }

        binarySearch(nums, k, min, max);
        return res;
    }

    public void binarySearch(int[] nums, int k, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isFeasible(nums, k, mid) <= k) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public int isFeasible(int[] nums, int k, int n) {
        int c = 0, total = 0;
        for (int i : nums) {
            if (total + i <= n) {
                total += i;
            } else {
                c++;
                total = i;
            }
        }
        return c + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7, 2, 5, 10, 8}; 
        int k = 2; 
        System.out.println(solution.splitArray(nums, k)); 
    }
}
