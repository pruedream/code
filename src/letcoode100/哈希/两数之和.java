package letcoode100.哈希;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author spike
 * @version 1.0.0
 *
 * 1. 两数之和
 *
 */
public class 两数之和 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
                 int[] q1 = new int[2];
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    q1[0] = map.get(target-nums[i]);
                    q1[1] = i;
                    return q1;
                }
                map.put(nums[i],i);
            }

            return q1;
        }
    }
}
