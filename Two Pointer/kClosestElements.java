//658. Find K Closest Elements
//Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

//Two Pointer Solution
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr == null || arr.length == 0)return result;
        int lptr = 0;
        int hptr = arr.length-1;
        while(hptr-lptr>=k){
            int distL = Math.abs(x-arr[lptr]);
            int distR = Math.abs(x-arr[hptr]);
            
            if(distL>distR){
                lptr++;
            }else{
                hptr--;
            }
        }
        for(int i = lptr;i<=hptr;i++){
            result.add(arr[lptr]);
            lptr++;
        }
        return result;
    }
}