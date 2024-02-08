package letcoode100.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 40. 组合总和 II
 *
 */
public class 组合需要去重 {

    class Solution {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int all = 0;
        boolean used[] ;
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            used = new boolean[candidates.length];
            backingTracking(0,target,candidates);
            return result;

        }

        public void backingTracking(int start,int target,int[] candidates){
            //有和的一定记得加这个条件，不然停不下来。
            if(all>target){
                return;
            }
              if(all == target){
                  result.add(new ArrayList<>(path));
                  return;
              }

             for(int i=start;i<candidates.length;i++){
                 // 去重就是对同一层进行去重，也就是本次for循环里的元素，不涉及到下一层。
                 if(i!=0 && candidates[i] == candidates[i-1] && !used[i-1]){
                   continue;
                 }
                 path.add(candidates[i]);
                 used[i] = true;
                 all = all +candidates[i];
                 backingTracking(i+1,target,candidates);
                 all = all-candidates[i];
                 path.remove(path.size()-1);
                 used[i] = false;

             }
        }
    }
}
