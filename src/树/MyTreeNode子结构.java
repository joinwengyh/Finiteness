package 树;

/**
 * @Author Hua
 * @Date: 2021/10/17 14:16
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4 
 *   /
 *  1
 */
public class MyTreeNode子结构 {
    int val;
    MyTreeNode子结构 left;
    MyTreeNode子结构 right;

    public MyTreeNode子结构() {
    }
    public static MyTreeNode子结构 getA(){
        MyTreeNode子结构 myTreeNode1 = new MyTreeNode子结构();
        MyTreeNode子结构 myTreeNode2 = new MyTreeNode子结构();
        MyTreeNode子结构 myTreeNode3 = new MyTreeNode子结构();
        MyTreeNode子结构 myTreeNode4 = new MyTreeNode子结构();
        MyTreeNode子结构 myTreeNode5 = new MyTreeNode子结构();

        myTreeNode1.val=3;
        myTreeNode1.left=myTreeNode2;
        myTreeNode1.right=myTreeNode3;

        myTreeNode2.val=4;
        myTreeNode2.left=myTreeNode4;
        myTreeNode2.right=myTreeNode5;

        myTreeNode4.val=1;
        myTreeNode4.left=null;
        myTreeNode4.right=null;

        myTreeNode5.val=2;
        myTreeNode5.left = null;
        myTreeNode5.right= null;

        myTreeNode3.val=5;
        myTreeNode3.left = null;
        myTreeNode3.right= null;

        return myTreeNode1;
    }

    public static MyTreeNode子结构 getB(){
        MyTreeNode子结构 myTreeNode1 = new MyTreeNode子结构();
        MyTreeNode子结构 myTreeNode2 = new MyTreeNode子结构();

        myTreeNode1.val=4;
        myTreeNode1.left=myTreeNode2;
        myTreeNode1.right=null;

        myTreeNode2.val=1;
        myTreeNode2.left=null;
        myTreeNode2.right=null;

        return myTreeNode1;
    }

}
