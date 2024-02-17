package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 142. 环形链表 II
 *    快慢指针，相遇后，启一个新的head节点与slow同时遍历，直到相等，就是起始点
 *
 */
public class top32 {

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
