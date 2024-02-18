package CodeTop.Top40;

import java.util.PriorityQueue;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 *23. 合并 K 个升序链表
 *   使用优先级队列，该数据结构的特征是会根据指定的排序方式将数据排序，即升序或降序，在new的时候通过比较器指定
 */
public class top10 {


    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
              if(lists == null || lists.length == 0){
                  return null;
              }

            PriorityQueue<ListNode> qw = new PriorityQueue<>(lists.length,(o1,o2)->{
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
