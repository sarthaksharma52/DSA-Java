class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeHelper(nums1, m - 1, nums2, n - 1, m + n - 1);
    }

    private void mergeHelper(int[] nums1, int i, int[] nums2, int j, int k) {
        if (j < 0) {
            return;
        }

        if (i < 0) {
            nums1[k] = nums2[j];
            mergeHelper(nums1, i, nums2, j - 1, k - 1);
            return;
        }

        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            mergeHelper(nums1, i - 1, nums2, j, k - 1);
        } else {
            nums1[k] = nums2[j];
            mergeHelper(nums1, i, nums2, j - 1, k - 1);
        }
    }
}