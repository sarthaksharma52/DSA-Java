class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ls = new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();

        if(s.length()<10){
            return ls;
        }
        
        for(int i=0;i<=s.length()-10;i++){
            String str = s.substring(i,i+10);
            hm.put(str,hm.getOrDefault(str,0)+1);
        }

        for(String key:hm.keySet()){
            if(hm.get(key)>1){
                ls.add(key);
            }
        }
        return ls;
    }
}