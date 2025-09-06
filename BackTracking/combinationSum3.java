class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(ans,temp,k,n,1);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> temp, int k, int n,int start){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(n<0 || k<0) return;

        for(int i=start;i<=9;i++){
            temp.add(i);
            backtrack(ans,temp,k-1,n-i,i+1);
            temp.remove(temp.size()-1);
        }
    }
}