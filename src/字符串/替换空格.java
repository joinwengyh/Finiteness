package 字符串;

/**
 * @Author Hua
 * @Date: 2021/10/13 15:45
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class 替换空格 {
    public static String replaceSpace1(String s) {
        return s.replace(" ", "%20");
    }

    public static String replaceSpace2(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            } else res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace2("21 3"));
        System.out.println(isHappy(82));
    }


    public static boolean isHappy (int n) {

        int fast = n, slow = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
        }while(slow != fast);
        if(fast == 1)
            return true;      // 如果相遇的时候是1，就是快乐数
        else
            return false;     // 否则不是快乐数，陷入了无限循环
    }

    private static int squareSum(int m){
        int squaresum = 0;
        while(m != 0){
            squaresum += (m % 10)*(m % 10);
            m /= 10;
        }
        return squaresum;
    }

}
