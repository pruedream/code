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
           ListNode newHead = new ListNode(-1);
           ListNode result = newHead;
           newHead.next = head;
           ListNode q1 = head;

           while (q1!=null){
               ListNode as = q1.next;
               if(q1.val == val){
                   newHead.next = as;
                   q1 = as;
               }else {

                   q1 = as;
                   newHead = newHead.next;
               }
           }
           return result.next;
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
