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


//////////////////////run all test case except last one   //////////////////////////////////////


class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            result[i] = check(nums,queries[i][0],queries[i][1]);
        }
        return result;
    }
    private boolean check(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if ((nums[i] % 2) == (nums[i + 1] % 2)) {
                return false;
            }
        }
        return true;
    }
}


///////   best approach run all test cases   ////////////



class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
      boolean[] ans = new boolean[queries.length];
      int[] parityIds = new int[nums.length];
      int id = 0;
      parityIds[0] = id;
  
      for (int i = 1; i < nums.length; ++i) {
        if (nums[i] % 2 == nums[i - 1] % 2)
          ++id;
        parityIds[i] = id;
      }
  
      for (int i = 0; i < queries.length; ++i) {
        final int from = queries[i][0];
        final int to = queries[i][1];
        ans[i] = parityIds[from] == parityIds[to];
      }
  
      return ans;
    }
  }


