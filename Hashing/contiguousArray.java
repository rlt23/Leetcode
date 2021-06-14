//525. Contiguous Array
//Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 class Solution {
    public int findMaxLength(int[] nums) {
    int result = 0;
        if(nums.length ==0 || nums == null)return result;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        hmap.put(0,-1);
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                count-=1;
            }else{
                count+=1;
            }
            if(hmap.containsKey(count)){
                result = Math.max(result, i-hmap.get(count));
            }else{
                hmap.put(count,i);
            }
        }
        return result;
    }
}