package 树;

/**
 * @Author Hua
 * @Date: 2021/10/17 14:10
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4 
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 */
public class 树的子结构 {
    //大神写法
    public static boolean isSubStructure(MyTreeNode子结构 A, MyTreeNode子结构 B) {
        return (A!=null&&B!=null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

    static boolean recur(MyTreeNode子结构 A, MyTreeNode子结构 B) {
        if (B==null)return true;
        if (A==null||A.val!=B.val)return false;
         return recur(A.left, B.left) && recur(A.right, B.right);
    }


    //凡人写法
    public static boolean isSubStructure2(MyTreeNode子结构 A, MyTreeNode子结构 B) {
        if (A==null||B==null)return  false;
        //以 节点 A 为根节点的子树 包含树 B ，对应 recur2(A, B)；
        if (recur2(A,B)){
            return true;
        }
        //树 B 是 树 A 左子树 的子结构，对应 isSubStructure(A.left, B)；
        //树 B 是 树 A 右子树 的子结构，对应 isSubStructure(A.right, B)；
       return isSubStructure2(A.left, B) || isSubStructure2(A.right, B);

        //大神写法
//        return (A!= null && B!= null) && (recur(A,B) || isSubStructure2(A.left,B) || isSubStructure2(A.right,B));
    }

    private static boolean recur2(MyTreeNode子结构 a, MyTreeNode子结构 b) {
        if (b==null)return true;
        if (a==null||a.val!=b.val)return  false;
        return recur2(a.left, b.left) && recur2(a.right, b.right);
    }


    public static void main(String[] args) {
        MyTreeNode子结构 a = MyTreeNode子结构.getA();
        MyTreeNode子结构 b = MyTreeNode子结构.getB();
        isSubStructure(a, b);
    }
}
