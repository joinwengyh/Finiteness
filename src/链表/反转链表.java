package 链表;

/**
 * @Author Hua
 * @Date: 2021/12/7 15:59
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class 反转链表 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
        public static ListNode reverseList(ListNode head) {
          ListNode a=null;
          ListNode b=head;
          while (b!=null){
              ListNode c= b.next;
              b.next=a;
              a=b;
              b=c;
            }
          return  a;
        }


}
