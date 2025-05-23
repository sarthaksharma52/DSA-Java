class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> arr = new ArrayList<>();
        arr.add(words[0]);
        int last = groups[0];

        for(int i=1;i<words.length;i++){
            if(groups[i]!=last){
                arr.add(words[i]);
                last = groups[i];
            }
        }
        return arr;
    }
}