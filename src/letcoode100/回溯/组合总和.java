package letcoode100.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 * <p>
 * 39. 组合总和
 *         组合总和一定要记得加 ，防止一直递归
 *             if (all > target) {
 *                 return;
 *             }
 *
 *
 */
public class 组合总和 {

    public static void main(String[] args) {

    }


    class Solution {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int all = 0;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            backTracking(0, candidates, target);
            return result;
        }

        public void backTracking(int start, int[] candidates, int target) {
           // 防止无限递归
            if (all > target) {
                return;
            }

            if (all == target) {
                result.add(new ArrayList<>(path));
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                path.add(candidates[i]);
                all = all + candidates[i];
                backTracking(i, candidates, target);
                path.remove(path.size() - 1);
                all = all - candidates[i];
            }
        }
    }

}
