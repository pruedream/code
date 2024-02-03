package CodeTop.Top40;

import java.net.SocketTimeoutException;

/**
 * @author spike
 * @version 1.0.0
 *
 * 215. 数组中的第K个最大元素
 */
public class top5 {


    public static void main(String[] args) {

    }

    class Solution {
        int result;
        public int findKthLargest(int[] nums, int k) {

            sort(nums,0,nums.length-1,k,nums.length-1);

            return result;
        }


        public   void   sort(int sd[],int left,int right,int k,int relright){
            if(left>=right){
                return;
            }
            //用两个指针一起从头开始， 寻找小于的值，然后两个指针交换
            int i=left,h=left;
            while (h!=right){
                if(sd[h]<=sd[right]){
                    int as=sd[i];
                    sd[i]=sd[h];
                    sd[h]=as;
                    i++;
                }
                h++;
            }
            int zx=sd[i];
            sd[i]=sd[right];
            sd[right] = zx;

              if(relright-k+1 == i){
                  result = sd[i];
                 return;
              }

            sort(sd,left,i-1 ,k,relright);
            sort(sd,i+1,right ,k,relright);
        }
    }
}
