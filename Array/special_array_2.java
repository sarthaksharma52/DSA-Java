class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        
        for (int q = 0; q < queries.length; q++) {
            int from = queries[q][0];
            int to = queries[q][1];
            
            boolean isSpecial = true;
            
            for (int i = from; i < to; i++) {
                if ((nums[i] % 2) == (nums[i + 1] % 2)) {
                    isSpecial = false;
                    break;
                }
            }
            
            result[q] = isSpecial;
        }
        
        return result;
    }

}