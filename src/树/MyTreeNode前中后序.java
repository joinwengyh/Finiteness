package 树;

/**
 * @Author Hua
 * @Date: 2021/10/18 14:01
 *         1
 *  *       \
 *  *       2
 *  *     /
 *  *   3
 */
public class MyTreeNode前中后序 {
    int val;
    MyTreeNode前中后序 left;
    MyTreeNode前中后序 right;

    public MyTreeNode前中后序() {
    }

    public  static MyTreeNode前中后序 getRoot() {
        MyTreeNode前中后序 myTreeNode1 = new MyTreeNode前中后序();
        MyTreeNode前中后序 myTreeNode2 = new MyTreeNode前中后序();
        MyTreeNode前中后序 myTreeNode3 = new MyTreeNode前中后序();

        myTreeNode1.val=1;
        myTreeNode1.left=null;
        myTreeNode1.right=myTreeNode2;

        myTreeNode2.val=2;
        myTreeNode2.left = myTreeNode3;
        myTreeNode2.right = null;

        myTreeNode3.val=3;
        myTreeNode3.left = null;
        myTreeNode3.right = null;

        return myTreeNode1;
    }
}
