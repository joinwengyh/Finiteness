package 字符串;

/**
 * @Author Hua
 * @Date: 2021/10/14 14:47
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 *  输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"

 */
public class 左旋转字符串 {
    //字符串切片
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
    // 列表遍历拼接
    public static String reverseLeftWords2(String s, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = n; i < s.length(); i++) {
            stringBuffer.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }
    //利用求余运算，可以简化代码。
    public static String reverseLeftWords2plus(String s, int n) {
        StringBuilder str=  new  StringBuilder();
        for(int i=n;i<s.length()+n;i++){
            str.append(s.charAt(i%s.length()));
        }
        return str.toString();
    }
    //字符串遍历拼接
    public static String reverseLeftWords3(String s, int n) {
        String str ="";
        for (int i = n; i < n + s.length(); i++) {
            str = str + s.charAt(i % s.length());
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords2("abcd", 2));

    }
}
