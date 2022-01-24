package 数组;

/**
 * @Author Hua
 * @Date: 2021/10/4 22:16
 * 给定一个只包含整数的有序数组 nums ，每个元素都会出现两次，唯有一个数只会出现一次，请找出这个唯一的数字。
 *  输入: nums = []
 *  输出: 2
 *
 */
public class 排序数组中只出现一次的数字 {
    //二分查找
    public static int singleNonDuplicate(int[] nums) {
        int left = 0; int right=nums.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            mid = mid % 2 == 1 ? mid - 1 : mid;
            if (nums[mid] == nums[mid + 1]) {
                left += 2;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    //直接异或
    public static int singleNonDuplicate2(int[] nums) {
        int num =0;
        for(int i:nums){
            num=num^i;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    }
}
