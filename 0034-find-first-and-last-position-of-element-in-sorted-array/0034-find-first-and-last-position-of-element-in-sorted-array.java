import java.util.Arrays;

class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                int j = i;
                while (j + 1 < nums.length && nums[j + 1] == target) {
                    j++;
                }
                arr[1] = j;
                break;  
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));  

}
}

