package letcoode100.动态规划.子串;

/**
 * @author spike
 * @version 1.0.0
 *
 * 53. 最大子数组和
 */
public class 最大子数组和 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int [] dp = new int[nums.length];
            int Max= nums[0];
            dp[0] = nums[0];
            for(int i=1;i<nums.length;i++ ){
                dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
                Max = Math.max(Max,dp[i]);
            }

            return Max;
        }
    }


}
