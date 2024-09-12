class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans1 = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            String number = str.replaceAll("[^0-9]","");
            String string = str.replaceAll("[0-9]","");
            int position = Integer.parseInt(number) - 1;
            ans1[position] = string;
        }
        

        String ans = String.join(" ",ans1);
        return ans;
    }
}