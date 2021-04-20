//39. Combination Sum
//Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
//The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
//It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

//BRUTE FORCE

class Solution {
    List<List<Integer>>result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if(candidates.length ==0 || candidates == null)return result;
        helper(candidates,target, 0 ,new ArrayList<>());
        return result;
    }
    private void helper(int[] candidates, int target, int index, List<Integer> path){
        //base
        if(target<0 || index == candidates.length)return;
        if(target == 0){
            result.add(path);
            return;
        }
        //logic
        //not choose
        helper(candidates, target, index+1, new ArrayList<>(path));
        //choose
        path.add(candidates[index]);
        helper(candidates, target - candidates[index], index, new ArrayList<>(path));
    }
}

//BACKTRACKING