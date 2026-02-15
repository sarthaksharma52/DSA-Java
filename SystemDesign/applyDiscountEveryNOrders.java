package SystemDesign;

class Cashier {
    int n;
    int discount;
    int[] prices;
    int count = 0;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        this.prices = new int[201];
        for(int i=0;i<products.length;i++){
            this.prices[products[i]] = prices[i];
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        double bill = 0;
        for(int i=0;i<product.length;i++){
            bill += amount[i]*prices[product[i]];
        }
        count++;
        if(count == n){
            bill = bill * ((100 - discount) / 100.0);
            count = 0;
        }
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */