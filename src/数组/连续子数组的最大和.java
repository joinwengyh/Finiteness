package 数组;

/**
 * @Author Hua
 * @Date: 2021/10/4 11:40
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。(要求时间复杂度为O(n))
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 */
public class 连续子数组的最大和 {
    //动态规划
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        for (int i = 1;i<nums.length;i++ ) {
            nums[i] = nums[i] + Math.max(nums[i - 1], 0);
            result = Math.max(result, nums[i]);
        }
        return result;
    }


    public static int maxSubArray2(int[] nums) {
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + nums[i - 1] > nums[i]){
                nums[i] = nums[i] + nums[i - 1];

            }else if(nums[i] + nums[i - 1] < nums[i]){
                nums[i] = nums[i] +0;
            }
            res = Math.max(res,nums[i]);

        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
