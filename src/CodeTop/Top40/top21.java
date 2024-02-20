package CodeTop.Top40;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 *  121. 买卖股票的最佳时机
 */
public class top21 {

    class Solution {
        public int maxProfit(int[] prices) {
         int max = 0;
         int slow = Integer.MAX_VALUE;
         for(int i=0;i<prices.length;i++){
            if(prices[i] > slow){
                max = max > prices[i] - slow ? max: prices[i] - slow;
            }else {
                slow = prices[i];
            }
         }

         return max;
        }
    }
}
