class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<Integer>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int arr4[] = new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            arr4[k] = arr.get(k);
        }
        return arr4;
    }
}