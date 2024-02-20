package CodeTop.Top40;

/**
 * @author spike
 * @version 1.0.0
 *
 * 88. 合并两个有序数组
 *        从后面开始遍历，因为有空位
 */
public class top26 {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
                 int k =nums1.length-1;
                 int j = m-1;
                 int l = n-1;
                 while (j>=0 || l>=0){

                     if(j==-1){
                         nums1[k] = nums2[l];
                         l--;
                     }else if(l==-1){
                         nums1[k] = nums1[j];
                         j--;
                     } else if(nums1[j]>nums2[l]){
                         nums1[k] = nums1[j];
                         j--;
                     }else {
                         nums1[k] = nums2[l];
                         l--;
                     }
                     k--;
                 }
        }
    }
}
