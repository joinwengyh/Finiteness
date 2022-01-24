package 动态规划;

import java.util.ArrayList;

/**
 * @Author Hua
 * @Date: 2021/10/11 14:49
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * F(0) = 0,   F(1) = 1     // 0 1 1 2 3 5 8 13
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 输入：n = 2
 * 输出：1
 */
public class 斐波那契数列 {
    //动态规划
    public static int fib(int n) {
        if (n<=1)return n;
        int[] dp = new int[n + 1];
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<n+1;i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
    }
    //暴力递归
    public static int fib2(int n) {
        return fi(n);
    }
    public static int fi(int n){
        if(n<=1)return n;
        return fi(n-1)+fi(n-2);
    }
    //数组
    public static int fib3(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for (int i = 2; i < n + 1; i++) {
            arr.add((arr.get(i - 1) + arr.get(i - 2))%1000000007);
        }
        return arr.get(n);
    }

    public int fib4(int n) {
        if(n<=1)return n;
        int q=0;int p=0;int r=1;
        for(int i=2;i<=n;i++){
            q=p;
            p=r;
            r=(q+p)%1000000007;
        }
        return r;
    }


    public static void main(String[] args) {
        System.out.println(fib(2));
    }
}
