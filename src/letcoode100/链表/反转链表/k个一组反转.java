package letcoode100.链表.反转链表;

import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 25. K 个一组翻转链表
 *
 */
public class k个一组反转 {

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
              if(head == null){
                  return head;
              }

              ListNode a = head;
              ListNode b = head;
              for(int  i =0;i<k;i++){
                  if(b == null){
                      return a;
                  }
                 b = b.next;
              }
            ListNode newHead = reverse(a, b);
            newHead.next = reverseKGroup(b, k);
             return newHead;
        }
        // 迭代反转  head 到 end  不包括end  反转整个链表也是这样的，不过end为null ,也就是最后一个节点的next
        public  ListNode reverse(ListNode head,  ListNode end){
            ListNode pre = null, a = head;
            while (a!=end){
                ListNode gh  = a.next;
                a.next = pre;
                pre = a;
                a = gh;
            }

            return pre;
        }


    }


    class ListNode{
        int val;
        ListNode next;
    }
}
