package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 912. 排序数组    快速排序
 */
public class top8 {

    public static void main(String[] args) {

    }

    class Solution {
        public int[] sortArray(int[] nums) {
            sort(nums,0,nums.length-1);

            return nums;
        }


        public void sort(int[] nums,int left,int right){
            if(left>=right){
                return;
            }
            //指针i的左边一定全部是小于基准值的（不包括i本身）
            int i=left;
            int j=left;
            while (j!=right){
                if(nums[j]<=nums[right]){
                    int nm = nums[j];
                    nums[j] = nums[i];
                    nums[i] = nm;
                    i++;
                }
                j++;
            }

            int nm = nums[right];
            nums[right] = nums[i];
            nums[i] = nm;

            sort(nums,left,i-1);
            sort(nums,i+1,right);

        }

    }
}
