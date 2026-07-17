// Iteration 1:
// BuyingPrice = ∞
// Price = 7
// ∞ < 7 ❌ FALSE
// → else runs
// → BuyingPrice = 7


// 🔹 Iteration 2:
// BuyingPrice = 7
// Price = 1
// 7 < 1 ❌ FALSE
// → else runs
// → BuyingPrice = 1


// 🔹 Iteration 3:
// BuyingPrice = 1
// Price = 5
// 1 < 5 ✅ TRUE
// → IF runs (NOT else!)
// → profit = 4
// → MaxProfit = 4

//else does NOT run every time — it only runs when you find a new smaller buying price.
// 👉 Once you hit a bigger price later, the if starts running and profit gets updated.






public class A5_StockPrices {


    public static int buySellingPrices(int Selling_Prices[]){

        int MaxProfit= 0;
        int BuyingPrice = Integer.MAX_VALUE;


        for (int i = 0; i < Selling_Prices.length; i++) {
            if (BuyingPrice < Selling_Prices[i]) {
                int profit = Selling_Prices[i] - BuyingPrice;
                MaxProfit = Math.max(MaxProfit, profit);              
            }
            else{
                BuyingPrice = Selling_Prices[i];
            }
        }
        return MaxProfit;
        
    }
    public static void main(String[] args) {
        int Selling_Prices []={7, 6, 4, 3, 1};
        System.out.println(buySellingPrices(Selling_Prices));
        
    }
    
}
