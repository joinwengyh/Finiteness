package 数组;

/**
 * @Author Hua
 * @Date: 2021/10/8 15:21
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。
 * 输入: [7,5,6,4]
 * 输出: 5
 */
public class 数组中的逆序对 {
    //归并排序
    private int res = 0;

    public static void main(String[] args) {
        数组中的逆序对 test = new 数组中的逆序对();
        int[] arr = {7,5,6,4,2,4};

        int i = test.reversePairs(arr);
        System.out.println(i);
    }

    public int reversePairs(int[] nums) {

        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
        return res;
    }

    public void mergeSort(int[] arr, int left, int right, int[] temp) {

        if (left >= right) return;
        int mid = (left + right) / 2;//开始递归划分
        mergeSort(arr, left, mid, temp);//归并排序左部分（left,mid)
        mergeSort(arr, mid + 1, right,  temp);//归并排序左部分（left,mid)
        merge(arr, left, mid, right, temp);//合并

    }



    public void merge(int[] arr, int left, int mid, int right, int[] temp) {

        int i = left;//左部分首元素
        int j = mid + 1;//右部分首元素
        int k = 0;

        while (i <= mid && j <= right) {//在范围之内
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                res += mid + 1 - i;//核心代码
            }
        }
        //把左边剩余的数移入数组
        while (i <= mid) {//右边遍历完事了   左边还剩呢
            temp[k++] = arr[i++];
        }
        //把右边剩余的数移入数组
        while (j <= right) {//左边遍历完事了   右边还剩了
            temp[k++] = arr[j++];
        }
        int t = 0;//将temp中的元素  全部都copy到原数组里边去
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }


}
