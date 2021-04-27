//526. Beautiful Arrangement
//Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:
//perm[i] is divisible by i.
//i is divisible by perm[i].
//Given an integer n, return the number of the beautiful arrangements that you can construct.

class Solution {
    int count;
    boolean[] beautifulArr;
    public int countArrangement(int n) {
        count = 0;
        beautifulArr = new boolean[n+1];
        if(n == 0){
            return count;
        }
        helper(n,1);
        return count;
    }
    private void helper(int n, int pos){
        //base
        if(pos>n){
            count++;
        }
        //logic
        //action
        for(int i =1; i<=n;i++){
            if(beautifulArr[i] == false && (pos%i == 0 || i%pos ==0)){
                beautifulArr[i] = true;
            //recurse
            helper(n, pos+1);
            //backtrack
            beautifulArr[i] = false;
        }}
    }
}