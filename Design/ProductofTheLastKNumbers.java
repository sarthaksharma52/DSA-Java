class ProductOfNumbers {

    ArrayList<Integer> arr = new ArrayList<>();

    public ProductOfNumbers() {
        // Stream<String> stream = Stream.empty();
        // ArrayList<Integer> arr1 = new ArrayList<>();

    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int i=0;
        int product = 1;
        while(i<k){
            product = product*arr.get(arr.size()-k+i);
            i++;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */