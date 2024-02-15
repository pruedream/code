package letcoode100.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 * <p>
 * <p>
 * 78. 子集
 */
public class 子集 {


    class Solution {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            backTracking(0, nums);
            return result;
        }

        public void backTracking(int start, int[] nums) {
            result.add(new ArrayList<>(path));
            if (start >= nums.length) {
                return;
            }

            for (int i = start; i < nums.length; i++) {
                path.add(nums[i]);
                backTracking(i + 1, nums);
                path.remove(path.size() - 1);
            }
        }
    }
}
