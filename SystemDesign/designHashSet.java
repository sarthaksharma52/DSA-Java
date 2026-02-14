package SystemDesign;

class MyHashSet {
    List<Integer> hs;
    public MyHashSet() {
        hs = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!hs.contains(key)){
            hs.add(key);
        }
    }
    
    public void remove(int key) {
        for(int i=0;i<hs.size();i++){
            if(hs.get(i) == key){
                hs.remove(i);
                // System.out.println(hs);
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0;i<hs.size();i++){
            if(hs.get(i) == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */