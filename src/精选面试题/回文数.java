package 精选面试题;

/**
 * @Author Hua
 * @Date: 2021/10/10 12:05
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *输入：x = 121
 * 输出：true
 */
public class 回文数 {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }
    //暴力解法，不推荐
    public static boolean isPalindrome(int x) {
        String str=(new StringBuilder(x+"")).reverse().toString();
        return str.equals(x+"");
    }


    //字符串
    public static boolean isPalindrome2(int x) {

        //121
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() -1;

        while (i <= j){
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    //数学解法
    public boolean isPalindrome3(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }



}
