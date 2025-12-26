class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            arr[i] = nextGreater(nums1[i],nums2);
        }

        return arr;

    }

    private int nextGreater(int target, int[] nums2){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i] == target){
                for(int j=i+1;j<nums2.length;j++)
                {
                    if(nums2[j]>target){
                        return nums2[j];
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            arr[i] = nextGreater(nums1[i],nums2);
        }

        return arr;

    }

    private int nextGreater(int target, int[] nums2){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i] == target){
                for(int j=i+1;j<nums2.length;j++)
                {
                    if(nums2[j]>target){
                        return nums2[j];
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}
