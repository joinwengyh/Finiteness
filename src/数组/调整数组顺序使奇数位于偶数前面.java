package 数组;

import java.util.Arrays;

/**
  * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
  *  @Author: Hua
  * @Date: 2021/10/3 20:02
  */

public class 调整数组顺序使奇数位于偶数前面 {

    //双指针写法
    public static int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (i < j) {
            while (i < j && (nums[i]&1) == 1) {//x&1==1---->x为奇数
                i++;
            }
            while (i < j && (nums[j]&1) == 0) {//x&1==0---->x为偶数
                j--;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }

    //快慢针写法
    public static int[] exchange2(int[] nums) {
        int slow=0;int fast=0;
        int temp;
        while (fast < nums.length) {
            if ((nums[fast] & 1)==1) {
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow]=temp;
                slow++;
            }
            fast++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] x = exchange(new int[]{1, 2, 3, 5,4});

            System.out.println(Arrays.toString(x));

    }

}
