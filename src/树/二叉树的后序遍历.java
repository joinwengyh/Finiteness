package 树;

import java.util.*;

/**
 * @Author Hua
 * @Date: 2021/10/18 15:53
 * 给定一个二叉树，返回它的 后序遍历（左右根）。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [3,2,1]
 */
public class 二叉树的后序遍历 {
    //递归
    public static List<Integer> postorderTraversal(MyTreeNode前中后序 root) {
        ArrayList<Integer> list=   new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private static void dfs(MyTreeNode前中后序 root, List<Integer> list){
        if(root==null)return;
        dfs(root.left,list);
        dfs(root.right,list);
        list.add(root.val);
    }
    //迭代(用栈模拟递归实现)
    public static List<Integer> postorderTraversal2(MyTreeNode前中后序 root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<MyTreeNode前中后序> stack = new LinkedList<MyTreeNode前中后序>();
        MyTreeNode前中后序 prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }

    public static List<Integer> postorderTraversal3(MyTreeNode前中后序 root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<MyTreeNode前中后序> stack = new Stack<>();
        Stack<MyTreeNode前中后序> stackRes = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            MyTreeNode前中后序 node = stack.pop();
            stackRes.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        while (!stackRes.isEmpty()) {
            res.add(stackRes.pop().val);
        }
        return res;
    }



    public static void main(String[] args) {
        MyTreeNode前中后序 root = MyTreeNode前中后序.getRoot();
        System.out.println(postorderTraversal3(root));
    }
}
