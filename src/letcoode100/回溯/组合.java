package letcoode100.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 * 77. 组合
 *
 */
public class 组合 {


    public static void main(String[] args) {

    }

    class Solution {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combine(int n, int k) {
             backTracking(1,k,n);
             return result;
        }

        public void backTracking(int start,int k,int n){
             if(path.size()==k){
                 result.add(new ArrayList<>(path));
                 return;
             }

             for(int i=start;i<=n;i++){
                 path.add(i);
                 backTracking(i+1,k,n);
                 path.remove(path.size()-1);
             }
        }
    }
}
