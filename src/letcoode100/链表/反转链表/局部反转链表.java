package letcoode100.链表.反转链表;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 * 92. 反转链表 II
 *
 */
public class 局部反转链表 {

    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
                  if(left==1){
                     return reverse(head,right);
                  }
                  // 移动到需要反转的位置,转换为反转链表前n
                  head.next = reverseBetween(head.next,left-1,right-1);

                  return head;
        }

        // 反转链表前n,起始索引为1           递归反转法
        ListNode path = null;
        public ListNode reverse(ListNode head,int n){
             if(n==1){
                 path = head.next;
                 return head;
             }
            ListNode reverse = reverse(head.next, n - 1);
            head.next.next = head;
             head.next = path;
             return reverse;
        }


        // 反转链表前n     迭代反转法


    }


    class ListNode{
        int val;
        ListNode next;
    }
}
