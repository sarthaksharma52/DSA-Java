class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(), candidates , target , 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans,List<Integer> temp,int[] candidates,int target,int start){

        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++){
                if(candidates[i]<=target){
                    temp.add(candidates[i]);
                    backtrack(ans,temp,candidates,target-candidates[i],i);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}