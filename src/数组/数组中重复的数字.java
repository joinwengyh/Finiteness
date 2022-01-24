package 数组;

import java.util.HashSet;

/**
 * @Author Hua
 * @Date: 2021/10/9 10:16
 *
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3

 */
public class 数组中重复的数字 {
    //hashset查找  时间O(N) 空间O(N)
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else set.add(nums[i]);
        }
        return -1;
    }
    //原地交换法 时间O(N) 空间O(1)
    public static int findRepeatNumber2(int[] nums) {
        int i =0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber2(new int[]{1, 2, 3, 4, 5, 6, 5}));
    }
}
