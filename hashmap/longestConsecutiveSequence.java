class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int longest = 0;

        for(int num : nums) {
            hs.add(num);
        }

        for(int num : hs){
            if(!hs.contains(num-1)){
                int count = 1;
                int cur = num;

                while(hs.contains(cur+1)){
                    count++;
                    cur++;
                }

                longest = Math.max(longest,count);
            }
        }
        
        return longest;

    }
}