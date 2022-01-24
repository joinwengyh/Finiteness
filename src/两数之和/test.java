package 两数之和;

import java.util.Arrays;
import java.util.HashMap;


public class test {
    //哈希表解法

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("没有找到");

    }


    //暴力解法
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没有找到");
    }



    public static void main(String[] args) {
        int[] a = new int[]{1,2 ,3, 4};
        int target = 3;
        int[] ints = twoSum2(a, target);
        System.out.println(Arrays.toString(ints));




    }
}
