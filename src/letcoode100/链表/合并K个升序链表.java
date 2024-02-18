package letcoode100.链表;

import java.util.PriorityQueue;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 *
 * 23. 合并 K 个升序链表
 */
public class 合并K个升序链表 {


    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists == null || lists.length == 0){
                return null;
            }

            PriorityQueue<ListNode> qw = new PriorityQueue<>(lists.length,(o1, o2)->{
                return o1.val-o2.val;
            });

            ListNode newHead = new ListNode();
            ListNode re = newHead;

            for(int  i=0;i< lists.length;i++){
                if(lists[i]!=null){
                    qw.add(lists[i]);
                }
            }

            while (!qw.isEmpty()){
                ListNode poll = qw.poll();
                re.next = poll;
                if(poll.next!=null){
                    qw.add(poll.next);
                }
                re = re.next;
            }
            return newHead.next;
        }
    }

    class ListNode{
        int val;
        ListNode next;
    }
}
