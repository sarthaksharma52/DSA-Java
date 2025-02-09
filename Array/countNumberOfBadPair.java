class Solution {
    public long countBadPairs(int[] nums) {

        // bruteforce technique


        // long bad = 0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(j-i != nums[j]-nums[i]){
        //             bad++;
        //         }
        //     }
        // }
        // return bad;

        // hashmap technique

        Map<Integer, Integer> freqMap = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;

        for (int j = 0; j < nums.length; j++) {
            int key = j - nums[j]; 
            goodPairs += freqMap.getOrDefault(key, 0);
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}