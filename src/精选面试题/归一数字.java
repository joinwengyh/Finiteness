package 精选面试题;

/**
 * @Author Hua
 * @Date: 2021/10/13 17:44
 * 归一数字的定义过程如下：
 * 给定一个正整数，计算它每一位数的平方和生成一个新的数字，重复这个过程，
 * 当生成的新数字等于1时，则认定该正整数为归一数字。
 * 例子: 82是一个归一数字
 *
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 输入
 * 82
 * 输出
 * true
 */
public class 归一数字 {
    //// 快慢指针法
    public static boolean isHappy (int n) {
        int slow= n;int fast=n;
        do {
            slow = addNums(slow);
            fast = addNums(fast);
            fast = addNums(fast);
        } while (slow!=fast);
        if (fast==1) return true; // 如果相遇的时候是1，就是快乐数
         else return false; // 否则不是快乐数，陷入了无限循环

    }

    private static int addNums(int num) {
      int i =0;
        while (num!=0) {
            i += (num % 10) * (num % 10);
           num= num/10;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(82));
    }
}
