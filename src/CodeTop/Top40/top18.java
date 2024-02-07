package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 * 160. 相交链表
 *
 */
public class top18 {

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            ListNode q1=headA;
            ListNode q2=headB;
            while (q1!=q2){
                q1 = q1==null ? headB:q1.next;
                q2 = q2==null ? headA:q2.next;
            }
              return q1;
        }
    }

    class ListNode{
        int val;
        ListNode next;
    }
}
