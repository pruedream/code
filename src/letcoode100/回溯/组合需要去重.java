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
                 // used 的作用是为了防止去重作用到下一层 如果used[i-1]为true的话说明 i-1是属于上一层的不是本层的，
                 // 不参与本层的去重，

                 // 也就是candidates[i] == candidates[i-1] 是对本层进行去重的判断，但是i-1 可能是上一层使用过的
                 // 如果是上一层使用过的，就不需要进行candidates[i] == candidates[i-1]的去重判断
                 // 通过used[i-1]是否为true来判断，即i-1在上一层是否被使用了
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
