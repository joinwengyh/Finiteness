package 树;

/**
 * @Author Hua
 * @Date: 2021/10/16 13:52
 *
 *          4
 *  *    /   \
 *  *   2     7
 *  *  / \   / \
 *  * 1   3 6   9
 */
public class MyTreeNode镜像 {
   public int val;
   public MyTreeNode镜像 left;
   public MyTreeNode镜像 right;

    public MyTreeNode镜像() {
    }

    public static MyTreeNode镜像 getMyTreeNode() {
        MyTreeNode镜像 myTreeNode1= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode2= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode3= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode4= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode5= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode6= new MyTreeNode镜像();
        MyTreeNode镜像 myTreeNode7= new MyTreeNode镜像();

        myTreeNode1.val=4;
        myTreeNode1.left=myTreeNode2;
        myTreeNode1.right=myTreeNode3;

        myTreeNode2.val=2;
        myTreeNode2.left=myTreeNode4;
        myTreeNode2.right=myTreeNode5;

        myTreeNode4.val=1;
        myTreeNode4.left = null;
        myTreeNode4.right = null;

        myTreeNode5.val=3;
        myTreeNode5.left = null;
        myTreeNode5.right = null;

        myTreeNode3.val=7;
        myTreeNode3.left=myTreeNode6;
        myTreeNode3.right=myTreeNode7;

        myTreeNode6.val=6;
        myTreeNode6.left=null;
        myTreeNode6.right = null;

        myTreeNode7.val=9;
        myTreeNode7.left=null;
        myTreeNode7.right = null;

        return myTreeNode1;
    }
}
