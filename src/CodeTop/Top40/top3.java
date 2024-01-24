package CodeTop.Top40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @author spike
 * @version 1.0.0
 *
 * 3. 无重复字符的最长子串
 * 哈希表保存扫描过的字符，出现重复后重置哈希表，重新以下一个字符为开头找子串
 *
 */
public class top3 {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
           Set<Character> set = new HashSet<>();
           int max=0;
           for(int i=0;i<s.length();i++){
               int jk = i;
               int count =0;
               while ( jk<s.length() & !set.contains(s.charAt(jk))){
                   set.add(s.charAt(jk));
                   count++;
                   jk++;
               }
               set.clear();
               max = max < count ? count : max;
           }

           return max;
        }
    }
}
