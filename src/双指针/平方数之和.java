package 双指针;

/**
 * @Author Hua
 * @Date: 2021/11/22 16:03
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c
 *
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 *
 * 输入：c = 3
 * 输出：false
 */
public class 平方数之和 {
    public static boolean judgeSquareSum(int c) {
        //双指针
        while (c<0) return false;
        int left=0;
        int right = (int) Math.sqrt(c);

        while (left < right) {
            int sum = left * left + right * right;
            if (c==sum) return true;
            else if (c>sum) left++;
            else right--;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }

    }
