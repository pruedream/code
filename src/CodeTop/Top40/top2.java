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
             ListNode q1 = null;
             ListNode q2= head;
             ListNode q3= head;

             while (q2!=null){
                q3 = q2.next;
                q2.next = q1;
                q1= q2;
                q2= q3;
             }
           return q1;

        }



    }


    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }

    }
}
