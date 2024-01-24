package letcoode100.链表;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author spike
 * @version 1.0.0
 * 160. 相交链表
 * 掌握两种方法
 *
 */
public class 相交链表 {


    public class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           /* Set<ListNode> set = new HashSet<>();
            while (headA!=null){
               set.add(headA);
               headA = headA.next;

            }

            while (headB!=null){
                if(set.contains(headB)){
                    return headB;
                }
                headB = headB.next;
            }

            return null;*/

            ListNode q1= headA;
            ListNode q2= headB;

            while (q1!=q2){
              q1 =  q1 == null ? headB:q1.next;
              q2 =  q2 == null ? headA:q2.next;
            }

            return q2;
        }
    }

    public class ListNode{
        int val;
        ListNode next;


    }


}
