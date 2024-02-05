package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 206. 反转链表
 */
public class top2 {

    class Solution {

        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode listNode = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return listNode;
        }


        class ListNode {
            int val;
            ListNode next;

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }

        }

    }
}
