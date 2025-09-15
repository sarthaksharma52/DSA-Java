class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        boolean ans = backtrack(s,wordDict,res);
        return ans;
    }

    private boolean backtrack(String s, List<String> wordDict, List<String> res){
        if(s.equals(String.join("", res))){
            return true;
        }

        if(String.join("", res).length() >= s.length() && !s.equals(String.join("", res))){
            return false;
        }

        for(int i=0;i<wordDict.size();i++){
            res.add(wordDict.get(i));
            if(backtrack(s,wordDict,res)){
                return true;
            }
            res.remove(res.size()-1);
        }
        return false;
    }
}