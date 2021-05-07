//31. Next Permutation
//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
//The replacement must be in place and use only constant extra memory.

class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
        if(nums.length == 0 || nums == null)return;
        //find the breach
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    //reverse elements
    private void reverse(int[] nums, int l , int r){
        while(l<=r){
            swap(nums,l,r);
            l++;r--;
        }
    }
    //reverse from i+1 to end
    private void swap(int[] nums, int i , int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        i++;
        j--;
    }
    
}