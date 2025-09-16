public class RotateArray {

    static int[] rotateRight(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return nums;
        k = k % n;                
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            res[newIndex] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        int k = 2; 
        int[] rotated = rotateRight(nums, k);

        System.out.print("Rotated: ");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();
    }
}
