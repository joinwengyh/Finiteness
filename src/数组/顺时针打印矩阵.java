package 数组;

/**
 * @Author Hua
 * @Date: 2021/10/9 12:54
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 */
public class 顺时针打印矩阵 {

    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];

        int left=0;
        int right=matrix[0].length-1;
        int top= 0;
        int bottom=matrix.length-1;
        int[] res =new int[(right+1)*(bottom+1)];
        int x =0;
        while(true){
            //向右
            for(int i=left;i<=right;i++){
                res[x]=matrix[top][i];
                x++;
            }
            if(++top>bottom)break;
            //向下
            for(int i=top;i<=bottom;i++){
                res[x]=matrix[i][right];
                x++;
            }
            if(--right<left)break;
            //向左
            for(int i=right;i>=left;i--){
                res[x]=matrix[bottom][i];
                x++;
            }
            if(--bottom<top)break;
            //向上
            for(int i=bottom;i>=top;i--){
                res[x]=matrix[i][left];
                x++;
            }
            if(++left>right)break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

}
