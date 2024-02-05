package CodeTop.Top40;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 * 46. 全排列
 *
 */
public class top24 {

    public static void main(String[] args) {


    }

    class Solution {

        boolean user[];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            user = new boolean[nums.length];
             backTracking(nums);
             return result;
        }

        public void backTracking(int[] nums){
            if(path.size()== nums.length){
               result.add(new ArrayList<>(path));
                return;
            }

            for(int i=0;i<nums.length;i++){
                if(user[i]==true){
                    continue;
                }
                path.add(nums[i]);
                user[i] = true;
                backTracking(nums);
                user[i] = false;
                path.remove(path.size()-1);
            }

        }

    }


}
