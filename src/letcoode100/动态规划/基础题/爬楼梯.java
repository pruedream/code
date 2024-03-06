package letcoode100.动态规划.基础题;

/**
 * @author spike
 * @version 1.0.0
 */
public class 爬楼梯 {

    class Solution {
        public int climbStairs(int n) {
            int a=1;
            int b= 1;
            int c = 1;
            for(int i=2;i<=n;i++){
                c= a+b;
                a= b;
                b= c;

            }
            return c;
        }
    }
}
