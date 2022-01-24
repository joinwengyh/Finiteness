package 树;/*
       3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */

public class MyTreeNode打印{
    public int val;
    public MyTreeNode打印 left;
    public MyTreeNode打印 right;


    public MyTreeNode打印() {
    }

    public static MyTreeNode打印 getTreeNode1(){
        MyTreeNode打印 myTreeNode1 = new MyTreeNode打印();
        MyTreeNode打印 myTreeNode2 = new MyTreeNode打印();
        MyTreeNode打印 myTreeNode3 = new MyTreeNode打印();
        MyTreeNode打印 myTreeNode4 = new MyTreeNode打印();
        MyTreeNode打印 myTreeNode5 = new MyTreeNode打印();
        myTreeNode1.val=3;
        myTreeNode1.left = myTreeNode2;
        myTreeNode1.right=myTreeNode3;

        myTreeNode2.val=9;
        myTreeNode2.left=null;
        myTreeNode2.right=null;

        myTreeNode3.val=20;
        myTreeNode3.left=myTreeNode4;
        myTreeNode3.right=myTreeNode5;

        myTreeNode4.val=15;
        myTreeNode4.left=null;
        myTreeNode4.right=null;

        myTreeNode5.val=7;
        myTreeNode5.left=null;
        myTreeNode5.right=null;
        return myTreeNode1;
    }

}