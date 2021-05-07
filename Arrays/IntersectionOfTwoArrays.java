//350. Intersection of Two Arrays II
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order./

//HASHMAP SOLUTION
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     if(nums1.length == 0 || nums1 == null)return new int[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2)return intersect(nums2,nums1);
        for(int num:nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num)){
                li.add(num);
                map.put(num, map.get(num)-1);
                map.remove(num,0);
            }
        }
        int [] result = new int[li.size()];
        for(int i=0;i<li.size();i++){
            result[i] = li.get(i);
        }
        return result;
    }
}

//Two Pointer Solution

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     if(nums1.length == 0 || nums1 == null)return new int[0];
       // HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(n1>n2)return intersect(nums2,nums1);
        int ptr1 = 0;
        int ptr2 =0;
        while(ptr1<n1 && ptr2 < n2){
            if(nums1[ptr1] == nums2[ptr2]){
                li.add(nums1[ptr1]);
                ptr1++;
                ptr2++;
            }else if(nums1[ptr1]>nums2[ptr2]){
                ptr2++;
            }else{
                ptr1++;
            }
        }
        int [] result = new int[li.size()];
        for(int i=0;i<li.size();i++){
            result[i] = li.get(i);
        }
        return result;
    }
}