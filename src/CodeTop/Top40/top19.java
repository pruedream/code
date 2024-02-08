package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 53. 最大子数组和
 *
 */
public class top19 {

    class Solution {
        public int maxSubArray(int[] nums) {
            int max = 0;
            for(int i=0;i<nums.length;i++){
                if(i==0){
                    max = nums[i];
                }
                int all = 0;
                for(int j=i;j<nums.length;j++){
                    all = all + nums[j];
                    max = max > all ? max:all;
                }
            }
           return max;
        }
    }
}
