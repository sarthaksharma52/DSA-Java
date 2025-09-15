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



////////////////////same question using DP because Backtracking give TLE(Time Limit Exceed) ////////////////



class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}

