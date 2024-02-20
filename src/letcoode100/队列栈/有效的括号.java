package letcoode100.队列栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 */
public class 有效的括号 {
    class Solution {
        public boolean isValid(String s) {
            Deque<Character> wq = new LinkedList<Character>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    wq.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == ')') {
                        if (!wq.isEmpty() && wq.peek() == '(') {
                            wq.pop();
                        } else {
                            return false;
                        }
                    } else if (s.charAt(i) == '}') {
                        if (!wq.isEmpty() && wq.peek() == '{') {
                            wq.pop();
                        } else {
                            return false;
                        }
                    } else {
                        if (!wq.isEmpty() && wq.peek() == '[') {
                            wq.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }

            if (!wq.isEmpty()) {
                return false;
            }

            return true;
        }
    }
}
