package letcoode100.链表.删除链表元素;

/**
 * @author spike
 * @version 1.0.0
 *
 * 203. 移除链表元素
 *
 */
public class 移除链表元素 {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return head;
            }
            ListNode newHead = new ListNode(-1);
            ListNode result = newHead;
            newHead.next = head;


            ListNode fast = head ;

            while (fast!=null && fast.next!=null) {
                if(fast.val == fast.next.val){
                    while (fast!=null && fast.next!=null && fast.next.val == fast.val){
                        fast = fast.next;
                    }
                    ListNode w1 = fast.next;
                    newHead.next = w1;
                    fast = fast.next;
                }else {
                    fast = fast.next;
                    newHead = newHead.next;
                }

            }
            return  result.next;
        }
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode(){
        }
        public ListNode(int val){
            this.val = val;
        }
    }
}
