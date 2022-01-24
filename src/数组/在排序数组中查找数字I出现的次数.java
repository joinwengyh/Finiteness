package 数组;

import java.util.HashMap;

/**
 * @Author Hua
 * @Date: 2021/10/5 10:49
 * 统计一个数字在排序数组中出现的次数
 * 在排序数组中查找数字 I
 *
 * 统计一个数字在排序数组中出现的次数
 */
//TODO
public class 在排序数组中查找数字I出现的次数 {
        //二分
    public static int search(int[] arr, int target) {
        // 搜索右边界 right
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i+j) / 2;
            if (arr[mid] <= target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        int right = i;
        if (j >= 0 && arr[j] != target) return 0;

        // 搜索左边界 right
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = (i+j) / 2;
            if (arr[mid] < target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        int left = j;
        return right-left - 1;
    }

    public static int search2(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int mid = (right + left) / 2;
            if (arr[mid] >= target) {
                right = mid;
                // nums[mid] 靠左
            } else
                 left = mid + 1;
            }
        while (left < arr.length && arr[left++] == target) {
            count++;
        }
        return count;
    }
    //哈希表
    public static int search3(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        if (map.containsKey(target)) {
           return map.get(target);
        }
        return 0;
    }



    public static void main(String[] args) {
        System.out.println(search3(new int[]{5,7,7,8,8,10},8));
    }

}
