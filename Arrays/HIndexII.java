//275. H-Index II

//BRUTE FORCE
class Solution {
    public int hIndex(int[] citations) {
        for(int i= 0;i<citations.length;i++){
            int diff = citations.length-i;
            if(diff<=citations[i]){
                return diff;
            }
        }
        return 0;
    }
}