package 数组;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author Hua
 * @Date: 2021/10/8 10:41
 * 给定一个只包含整数的有序数组 nums ，每个元素都会出现两次，唯有一个数只会出现一次，请找出这个唯一的数字。
 */
public class 排序数组中只出现一次的数字2 {
    //按位异或（xor）操作符
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0;i<nums.length;i++ ) {
             result = result ^ nums[i];
        }
        return result;
    }

    //使用hash表
    public static int singleNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
            } else set.remove(nums[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {

            return iterator.next();
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{1, 2, 1, 2,4}));
    }
}
