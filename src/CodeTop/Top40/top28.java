package CodeTop.Top40;

import java.util.Arrays;

/**
 * @author spike
 * @version 1.0.0
 *
 * 300. 最长递增子序列
 */
public class top28 {

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
