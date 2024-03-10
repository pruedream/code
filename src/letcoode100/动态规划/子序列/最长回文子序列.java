package letcoode100.动态规划.子序列;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 *
 * 516. 最长回文子序列
 */
public class 最长回文子序列 {


    class Solution {
        public int longestPalindromeSubseq(String s) {
            int [][] dp= new int[s.length()][s.length()];

            for(int i = s.length()-1;i>=0;i--){

                for(int j = i;j<s.length();j++){
                    if(i==j){
                        dp[i][j] = 1; // 此处就是初始化
                    }else if(s.charAt(i) == s.charAt(j)){
                        dp [i][j] = dp[i+1][j-1] +2;
                    }else if(s.charAt(i) != s.charAt(j)){
                        dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                    }


                }
            }

            return dp[0][s.length()-1];

        }
    }
}
