class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        ans(answer,nums1,nums2);

        return answer;
    }
    public static void ans(List<List<Integer>> answer, int[] num1,int[] num2){
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        
        
        for(int i=0;i<num1.length;i++){
            boolean flag = false;
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag && !res1.contains(num1[i])){
                res1.add(num1[i]);
                flag = false;
            }
        }

        for(int i=0;i<num2.length;i++){
            boolean flag = false;
            for(int j=0;j<num1.length;j++){
                if(num2[i]==num1[j]){
                    flag = true;
                }
            }
            if(!flag && !res2.contains(num2[i])){
                res2.add(num2[i]);
                flag = false;
            }
        }

        answer.add(res1);
        answer.add(res2);

        return;
    }
}