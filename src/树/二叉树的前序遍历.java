package 树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author Hua
 * @Date: 2021/10/18 13:58
 * 给你二叉树的根节点 root ，返回它节点值的 前序遍历(根左右)。
 *     1
 *    /  \
 *   4    2
 *       /
 *     3
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,2,3]
 */
public class 二叉树的前序遍历 {
    //迭代(用栈模拟递归实现)
    public static List<Integer> preorderTraversal(MyTreeNode前中后序 root) {
        List<Integer> list = new ArrayList<>();
        if (root==null)return list;
        Stack<MyTreeNode前中后序> stack = new Stack<MyTreeNode前中后序>(){{push(root);}};
        while (!stack.isEmpty()) {
            MyTreeNode前中后序 node = stack.pop();
            list.add(node.val);
            if (node.right!=null) stack.push(node.right);
            if (node.left!=null) stack.push(node.left);
        }
        return list;
    }
    //递归
    public static List<Integer> preorderTraversal2(MyTreeNode前中后序 root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private static void dfs(MyTreeNode前中后序 root, List<Integer> list) {
        if (root==null)return;
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }


    public static void main(String[] args) {
        MyTreeNode前中后序 root = MyTreeNode前中后序.getRoot();
        System.out.println(preorderTraversal2(root));
    }
}
