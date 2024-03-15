package letcoode100.回溯.排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 * <p>
 * 47. 全排列 II
 */
public class 排列去重 {

    class Solution {

        List<List<Integer>> re = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used;

        public List<List<Integer>> permuteUnique(int[] nums) {
            used = new boolean[nums.length];
            Arrays.sort(nums);
            backTracking(nums);
            return re;

        }

        public void backTracking(int[] nums) {
            if (path.size() == nums.length) {
                re.add(new ArrayList<>(path));
                return;

            }


            for (int i = 0; i < nums.length; i++) {

                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                path.add(nums[i]);
                backTracking(nums);
                used[i] = false;
                path.remove(path.size() - 1);

            }
        }
    }
}
