class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] array = new int[2];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                arr.add(i);
            }
        }
        if(arr.size()==0){
            array[0] = -1;
            array[1] = -1;
            return array;
        }else{
            array[0] = arr.get(0);
            array[1] = arr.get(arr.size()-1);
            return array;
        }
    } 
}



/////////////////   binary search approach ///////////////////

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        result[0] = findFirst(nums, target);
        
        if (result[0] != -1) {
            result[1] = findLast(nums, target);
        }
        
        return result;
    }

    // Helper method to find the first occurrence of the target
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // Continue searching to the left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }

    // Helper method to find the last occurrence of the target
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // Continue searching to the right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }
}
