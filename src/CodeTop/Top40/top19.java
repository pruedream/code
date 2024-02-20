package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 53. 最大子数组和
 *
 */
public class top19 {



    public static void main(String[] args) {
        int kl[] = {-2,1,-3,4,-1,2,1,-5,4};
            top19 ui = new top19();
        Solution df =   ui.new Solution();
        df.maxSubArray(kl);
    }


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
