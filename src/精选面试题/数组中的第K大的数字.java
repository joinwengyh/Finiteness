package 精选面试题;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author Hua
 * @Date: 2021/11/21 15:50
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 */
public class 数组中的第K大的数字 {
    //快速排序
    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public static int  quickSelect(int[] a, int l, int r, int index) {
        int q = partition(a, l, r);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, r, index) : quickSelect(a, l, q - 1, index);
        }
    }


    public static int partition(int[] a, int l, int r) {
        // 哨兵初始化。该处的一个优化是，用随机函数选择一个数组下标k，然后swap(a, l, k)
        int x = a[l], j = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] < x) {
                swap(a, ++j, i);
            }
        }
        swap(a, l, j);
        return j;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

      //最小堆排序--优先队列
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            if (heap.size()<k) {
                heap.offer(num);
            }
            else if (heap.peek()<num){
                heap.poll();
                heap.offer(num);
            }
        }
        return heap.poll();
    }

    //神仙解法
    public static int findKthLargest3(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }


    public static void main(String[] args) {
        System.out.println(findKthLargest3(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
