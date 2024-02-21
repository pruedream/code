package letcoode100.动态规划.子串;

/**
 * @author spike
 * @version 1.0.0
 *
 *  5. 最长回文子串
 *  *
 *  *    递推公式
 *  *     dp i，j  = true    条件  jk[i] == jk[j] && j-i<=1
 *  *    dp[i] [j] = true   条件  jk[i] == jk[j] &&dp[i + 1] [j - 1]  == true
 *  *       dp[i][j] 表示i 到j 左闭右闭  的字符串是不是回文
 */
public class 最长回文子串 {

    public String longestPalindrome(String s) {
        char[] jk= s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        for(int i=s.length()-1;i>=0;i--){
            for(int j=0;j<s.length();j++){
                if(jk[i]==jk[j]){
                    if(j-i<=1){
                        dp[i][j] = true;
                        if(j-i > end-start){
                            end = j;
                            start = i;
                        }

                    }else if(dp[i+1][j-1]){
                        dp[i][j] = true;
                        if(j-i > end-start){
                            end = j;
                            start = i;
                        }
                    }


                }

            }
        }

        return s.substring(start,end+1);
    }
}
