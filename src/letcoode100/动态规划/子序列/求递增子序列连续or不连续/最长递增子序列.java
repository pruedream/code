package letcoode100.动态规划.子序列.求递增子序列连续or不连续;

import java.util.Arrays;

/**
 * @author spike
 * @version 1.0.0
 *
 * https://leetcode.cn/problems/longest-increasing-subsequence/description/
 */
public class 最长递增子序列 {


    class Solution {
        public int lengthOfLIS(int[] nums) {
            int [] dp = new int[nums.length];
            Arrays.fill(dp,1);
            int max = 1;

            for(int i=1;i<nums.length;i++){
                for(int j=0;j<i;j++){
                    if(nums[i]>nums[j]){
                        dp[i] = Math.max(dp[i],dp[j]+1);
                        max = max>dp[i] ? max:dp[i];
                    }
                }
            }

            return max;
        }
    }
}
