class Solution {
    public int reverse(int x) {
      String str = String.valueOf(x);
      int n = str.length();

      StringBuilder sb = new StringBuilder();
      if(str.charAt(0) != '-'){
        for(int i=n-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
…      catch (NumberFormatException e){
        return 0;
      }
    }
}