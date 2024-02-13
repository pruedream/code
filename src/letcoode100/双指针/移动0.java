package letcoode100.双指针;

import java.awt.image.renderable.RenderableImage;

/**
 * @author spike
 * @version 1.0.0
 *
 * 283. 移动零
 *
 */
public class 移动0 {

    class Solution {
        public void moveZeroes(int[] nums) {
            int slow=0;
            int fast=0;

            while (fast<nums.length){
                   if(nums[fast]!= 0){
                       int all = nums[slow];
                       nums[slow] = nums[fast];
                       nums[fast] = all;
                       slow++;
                   }
                   fast++;
            }
        }
    }


}
