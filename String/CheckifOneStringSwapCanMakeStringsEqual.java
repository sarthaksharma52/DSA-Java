class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        char temp;
        if(s1.equals(s2)){
            return true;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                arr1.add(s1.charAt(i));
                arr2.add(s2.charAt(i));
            }
        }
        if(arr1.size()>2 || arr1.size()==1){
            return false;
        }
        else if( arr1.get(0) == arr2.get(1) && arr1.get(1) == arr2.get(0) ){
            return true;
        }
        else{
            return false;
        }
    }
        
}