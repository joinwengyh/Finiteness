package 精选面试题;

/**
 * @Author Hua
 * @Date: 2021/11/5 20:10
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 */
public class 字符串压缩 {
    //快慢双指针
    public static String compressString(String S) {
        if (S.length() <= 1) return S;
        int left = 0;
        int right = 0;
        StringBuffer sb = new StringBuffer();
        while (right < S.length()) {
            if (S.charAt(left) == S.charAt(right)) {
                right++;
            } else {
                sb.append(S.charAt(left));
                sb.append(right - left);
                left = right;
            }
        }
        sb.append(S.charAt(left));
        sb.append(right - left);

        if (sb.length() >= S.length()) {
            return S;
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s= "aabcccccaaa";
        System.out.println(compressString(s));
    }

    }
