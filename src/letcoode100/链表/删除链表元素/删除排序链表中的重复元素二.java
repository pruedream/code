package letcoode100.链表.删除链表元素;

/**
 * @author spike
 * @version 1.0.0
 *
 * 82. 删除排序链表中的重复元素 II
 *
 *  需要两个指针，且一前一后，
 */
public class 删除排序链表中的重复元素二 {

    /*class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return head;
            }
            ListNode newHead = new ListNode(-1);
            ListNode result = newHead;
            newHead.next = head;

            ListNode fast = head ;

            while (fast!=null && fast.next!=null) {
                //判断是否是要删除的起点节点
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
*/
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode newHead = new ListNode(-1);
            newHead.next = head;
            ListNode q1 = newHead;
            ListNode q2 = head;


            while(q2!=null){
                if(q2.next !=null && q2.val == q2.next.val){
                    int a = q2.val;
                    while(q2!=null && q2.val==a){
                        q2 = q2.next;
                    }
                    q1.next = q2;

                }else{
                    q2 = q2.next;
                    q1 = q1.next;
                }

            }

            return newHead.next;

        }
    }
    class ListNode {
        int val;
        ListNode next;

        public ListNode(){
        }
        public ListNode(int val){
            this.val = val;
        }
    }
}
