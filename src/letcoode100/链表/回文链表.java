package letcoode100.链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 *  234. 回文链表
 *
 */
public class 回文链表 {

    class Solution {
        public boolean isPalindrome(ListNode head) {
            List<Integer> q1 = new ArrayList<>();

            while (head!=null){
                q1.add(head.val);
                head = head.next;
            }

            int j=0,k=q1.size()-1;
             while (j<=k){
                 if(!q1.get(j).equals(q1.get(k))){
                     return false;
                 }
                 k--;
                 j++;
             }

             return true;
        }
    }

    class ListNode{
        int val;
        ListNode next;
    }
}
