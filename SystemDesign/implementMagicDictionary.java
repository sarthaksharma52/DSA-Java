package SystemDesign;
import java.util.*;
class MagicDictionary {
    List<String> list;
    public MagicDictionary() {
        list = new ArrayList<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(String str : dictionary){
            list.add(str);
        }
    }
    
    public boolean search(String searchWord) {
        for(String str : list){
            if(str.length() != searchWord.length()){
                continue;    
            }
            
            int diff = 0;
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i)!= searchWord.charAt(i)){
                    diff++;
                }
            }
            if(diff == 1){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */