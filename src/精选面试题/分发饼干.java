package 精选面试题;

import java.util.Arrays;

/**
 * @Author Hua
 * @Date: 2021/10/27 20:49
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
 * 并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，
 * 这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。

输入: g = [1,2,3], s = [1,1]
输出: 1
解释:
你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
所以你应该输出1。

 */
public class 分发饼干 {
    //贪心算法
    public static int findContentChildren(int[] g, int[] s) {
        // 思路2：优先考虑胃口，先喂饱大胃口
        Arrays.sort(g);
        Arrays.sort(s);
        int start=s.length-1;
        int count=0;
        // 遍历胃口
        for (int i = g.length - 1; i >= 0; i--) {
            if (start >= 0 && s[start] >= g[i]) {
                start--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}
