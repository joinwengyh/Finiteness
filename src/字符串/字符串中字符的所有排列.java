package 字符串;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Hua
 * @Date: 2021/10/14 13:13
 *
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 */
//TODO
public  class 字符串中字符的所有排列 {

   static List<String> res = new LinkedList<>();
    static char[] c;
    public static String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
   static void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c));      // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x);                      // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1);                      // 开启固定第 x + 1 位字符
            swap(i, x);                      // 恢复交换
        }
    }
   static void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

    public static void main(String[] args) {
        String[] abcs = permutation("abc");
        for (String abc : abcs) {
            System.out.println(abc);
        }

    }

}
