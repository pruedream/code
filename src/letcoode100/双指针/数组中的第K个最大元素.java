package letcoode100.双指针;

/**
 * @author spike
 * @version 1.0.0
 */
public class 数组中的第K个最大元素 {

    class Solution {
        int max = 0;
        public int findKthLargest(int[] nums, int k) {

            sort(nums,0,nums.length-1,nums.length-1,k);
            return max;
        }

        public void sort(int[] nums,int left,int right,int rel,int k){
            /**
             * 此处不能>=否则【1】 1 的情况会返回默认的max
             */
            if(left>right){
                return;
            }

            int slow = left;
            int fast = left;

            while(fast!=right){
                if(nums[fast] <= nums[right]){
                    int a = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = a;
                    slow++;
                }
                fast++;
            }

            int a= nums[right];
            nums[right] = nums[slow];
            nums[slow] = a;

            if(rel-slow+1 == k){
                max = a;
                return;
            }

            sort(nums,left,slow-1,rel,k);
            sort(nums,slow+1,right,rel,k);


        }
    }
}
