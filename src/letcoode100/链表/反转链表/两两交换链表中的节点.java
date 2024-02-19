package letcoode100.链表.反转链表;

/**
 * @author spike
 * @version 1.0.0
 *
 * 24. 两两交换链表中的节点
 *
 */
public class 两两交换链表中的节点 {

    class Solution {
        public ListNode swapPairs(ListNode head) {
            return reverseKGroup(head,2);
        }

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
            a.next = reverseKGroup(b, k);
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
