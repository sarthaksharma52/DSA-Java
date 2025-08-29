class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] arrN = new int[n/2];
        int[] arrP = new int[n/2];

        int j=0,k=0,i=0;

        while(i<n){
            if(nums[i]>=0){
                arrP[j] = nums[i];
                j++;
            }
            else{
                arrN[k] = nums[i];
                k++;
            }
            i++;
        }

        i=0;
        int p1=0,p2=0;

        while(p1<n/2 && p2<n/2){
            nums[i] = arrP[p1];
            i++;
            nums[i] = arrN[p2];
            p1++;
            p2++;
            i++;
        }

        return nums;

    }
}