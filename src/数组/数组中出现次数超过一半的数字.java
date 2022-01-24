package 数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Hua
 * @Date: 2021/10/8 12:48
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 */
public class 数组中出现次数超过一半的数字 {
    //哈希表
    private static Map<Integer, Integer> countNums(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map;
    }


    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    //排序
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    //Boyer-Moore 投票算法
    public static int majorityElement3(int[] nums) {
        int count = 0;
        Integer i = null;
        for (int num : nums) {
            if (count == 0) {
                i = num;
            }
            count += (num == i) ? 1 : -1;
        }
        return i;
    }



    public static void main(String[] args) {
        System.out.println(majorityElement3(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}