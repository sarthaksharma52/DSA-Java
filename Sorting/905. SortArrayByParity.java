class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //phela pura array itrate kara ga or jo bhe even aai ga usa evenlist ma add kara ga or jo odd ho  ga usa oddlist ma add kara ga
        // then dono ko combine/join kar da ga evenlist.addAll(oddlist)
        //fir usa array ma convert kar da ga
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
            }
            even.addAll(odd);
            int[] arr = new int[even.size()];
            for(int k=0;k<even.size();k++){
                arr[k]=even.get(k);
            }
            return arr;
        }
    }
