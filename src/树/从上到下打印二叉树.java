package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Hua
 * @Date: 2021/10/15 14:19
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *    返回：
 * [3,9,20,15,7]
 */
public class 从上到下打印二叉树 {

    public static int[] levelOrder(MyTreeNode打印 root) {
        if (root==null) return new int[0];
        Queue<MyTreeNode打印> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            MyTreeNode打印 node = queue.poll();//从队列头部删除一个元素
            ans.add(node.val);
            if (node.left!=null) queue.offer(node.left);
            if (node.right!=null) queue.offer(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {

        MyTreeNode打印 treeNode = MyTreeNode打印.getTreeNode1();
        System.out.println(treeNode);

        int[] ints = levelOrder(treeNode);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
}
