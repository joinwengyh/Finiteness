package 字符串;

/**
 * @Author Hua
 * @Date: 2021/10/12 21:01
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
 * 则输出"student. a am I"。
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 *
 *
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
。
 *
 */
public class 翻转单词顺序 {
    //双指针
    public static String reverseWords(String s) {
        s = s.trim();
        int j=s.length()-1;
        int i = j;
        StringBuffer res = new StringBuffer();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s.substring(i + 1, j + 1)+" ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            } j = i;
        }
        return res.toString().trim();
    }
    //分割 + 倒序
    public static String reverseWords2(String s) {
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
            if(strs[i].equals("")) continue; // 遇到空单词则跳过
            res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
        }
        return res.toString().trim(); // 转化为字符串，删除尾部空格，并返回

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("weng yun hua"));
    }
}
