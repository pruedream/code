package letcoode100.链表.环形链表;

/**
 * @author spike
 * @version 1.0.0
 *
 * 142. 环形链表 II
 */
public class 环形链表二 {


    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow  == fast ){
                    ListNode re = head;
                    while (re!=slow){
                        re = re.next;
                        slow = slow.next;
                    }
                    return re;
                }
            }

            return null;
        }
    }

    class ListNode{
        int val;
        ListNode next;
    }
}
