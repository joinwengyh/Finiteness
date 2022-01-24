package 树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Hua
 * @Date: 2021/10/18 15:03
 * 给定一个二叉树的根节点 root ，返回它的 中序遍历（左根右）。
 *        1
 *  *      \
 *  *       2
 *  *     /
 *  *   3
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */
public class 二叉树的中序遍历 {
    //递归
    public static List<Integer> inorderTraversal(MyTreeNode前中后序 root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private static void dfs(MyTreeNode前中后序 root, ArrayList<Integer> list) {
        if (root==null)return;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }


    //迭代(用栈模拟递归实现)
    public static List<Integer> inorderTraversal2(MyTreeNode前中后序 root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null) return list;
        Stack<MyTreeNode前中后序> stack = new Stack<>();
        while (root != null || stack.size() > 0) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                MyTreeNode前中后序 node = stack.pop();
                list.add(node.val);
                root = node.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MyTreeNode前中后序 root = MyTreeNode前中后序.getRoot();
        System.out.println(inorderTraversal2(root));
    }
}
