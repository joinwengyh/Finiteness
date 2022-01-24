package 树;

import java.util.Stack;

/**
 * @Author Hua
 * @Date: 2021/10/16 13:42
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
输入：root = [4,2,7,1,3,6,9]
输出：[4,7,2,9,6,3,1]
 */
public class 二叉树的镜像 {
    //递归法
    public static MyTreeNode镜像 mirrorTree(MyTreeNode镜像 root) {
        if (root==null) return null;
        MyTreeNode镜像 leftRoot = mirrorTree(root.right);
        MyTreeNode镜像 rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    //辅助栈
    public static MyTreeNode镜像 mirrorTree2(MyTreeNode镜像 root) {
        if (root==null)return root;
        Stack<MyTreeNode镜像> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            MyTreeNode镜像 node = stack.pop();
            if (node.left!=null)stack.add(node.left);
            if (node.right!=null)stack.add(node.right);

            MyTreeNode镜像 temp= node.left;
            node.left=node.right;
            node.right=temp;
        }
        return  root;
    }


    public static void main(String[] args) {
        MyTreeNode镜像 myTreeNode = MyTreeNode镜像.getMyTreeNode();
        System.out.println(mirrorTree2(myTreeNode));
    }
}
