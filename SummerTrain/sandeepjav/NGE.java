import java.util.Stack;

public class NGE {

    static int[] rightNGE(int arr[]) {
        int[] right = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }
            right[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(arr[i]);
        }

        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 7, 3, 4, 6, 9 };
        int[] right = rightNGE(arr);
        for (int num : right) {
            System.out.print(num + " ");
        }
    }
}

