class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        generate(arr,"",n,n);
        return arr;
    }
    private void generate(List<String> arr, String str, int left, int right){
        if(left == 0 && right == 0){
            arr.add(str);
            return;
        }
        if(left>0){
            generate(arr,str+"(",left-1,right);
        }
        if(right>left){
            generate(arr,str+")",left,right-1);
        }
    }
}