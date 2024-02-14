package CodeTop.Top40;

import java.security.AlgorithmConstraints;

/**
 * @author spike
 * @version 1.0.0
 * <p>
 * <p>
 * 82. 删除排序链表中的重复元素 II
 */
public class top27 {

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode newHead = new ListNode();
            ListNode result = newHead;
            newHead.next = head;

            ListNode slow = head;
            ListNode fast = head.next;

            while (fast!=null) {
                  if(slow.val == fast.val){
                      while (fast!=null && slow.val == fast.val){
                          fast = fast.next;
                      }
                      newHead.next = fast;

                  }else {
                      fast = fast.next;
                      slow = slow.next;
                  }

            }

        }
    }

    class ListNode {
        int val;
        ListNode next;
    }
}
