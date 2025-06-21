class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        int length = 0;
        boolean odd = false;

        for(int freq : hm.values()){
            if(freq%2==0){
                length += freq;
            }
            else{
                length += freq-1;
                odd = true;
            }
        }

        if(odd) length += 1;
        return length;

    }
}