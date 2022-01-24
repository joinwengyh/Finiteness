package 数组;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author: Hua
 * @Date: 2021/10/3 20:02
 */
public class 二维数组中的查找 {
    //当成二叉搜索树来做
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] <target ) {
                j++;
            } else if (matrix[i][j] > target) {
                i--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3, 4}, {2, 3, 4, 5}, {6, 7, 8, 9}};
        int target = 90;

        System.out.println(findNumberIn2DArray(a, target));
    }
}
