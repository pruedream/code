package CodeTop.Top40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 15. 三数之和
 */
public class top6 {

    public static void main(String[] args) {

    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            //排序后好去重
            Arrays.sort(nums);
            int length = nums.length;
            List<List<Integer>> result = new ArrayList<>();


            for(int i=0;i<length-2;i++){
                int left = i+1;
                int right = length-1;
                // a的去重
                if(i!=0 && nums[i] == nums[i-1]){
                    continue;
                }

                while (left<right){
                    int all = nums[i]+nums[left]+nums[right];
                    // 根据结果移动具体的指针
                    if(all==0){
                        result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                        right--;
                        left++;
                        //b的去重
                        while (left<right && nums[left] == nums[left-1]) left++;
                        //c的去重
                        while (left<right && nums[right] == nums[right+1]) right--;
                    }else if(all>0){
                        right--;
                    }else {
                        left++;
                    }
                }
            }

            return result;
        }
    }
}
