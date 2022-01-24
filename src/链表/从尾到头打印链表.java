package 链表;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author Hua
 * @Date: 2021/10/12 13:12
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public  class 从尾到头打印链表 {

      static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }


    }

    //解题思路：辅助栈法
    public static int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = stack.removeLast();
        }
        return nums;
        }


        //递归法
    ArrayList<Integer> list = new ArrayList<>();
    public  int[] reversePrint2(ListNode head) {
        recur(head);
        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;

    }

    private  void recur(ListNode head) {
      if (head==null) return;
      recur(head.next);
        list.add(head.val);
    }



}