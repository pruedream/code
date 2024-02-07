package letcoode100.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 216. 组合总和 III
 *
 */
public class 组合总和3 {

    public static void main(String[] args) {

    }


    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int all = 0;
        public List<List<Integer>> combinationSum3(int k, int n) {

            backTracking(k,n,1);
            return result;
        }

        public void backTracking(int k , int n , int start){
            // 防止无限递归
            if(all > n || path.size() > k){
                return;
            }

            if(all == n && path.size() == k){
                result.add(new ArrayList<Integer>(path));
                return;
            }

            for(int i=start;i<=9;i++){
                path.add(i);
                all = all + i;
                backTracking(k,n,i+1);
                path.remove(path.size()-1);
                all = all - i;
            }


        }
    }
}
