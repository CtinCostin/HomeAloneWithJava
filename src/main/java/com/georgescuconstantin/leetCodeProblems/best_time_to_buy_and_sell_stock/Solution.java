package main.java.com.georgescuconstantin.leetCodeProblems.best_time_to_buy_and_sell_stock;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.maxProfit(new int[]{7, 7, 5, 3, 2, 1}));
    }


//    public static int maxProfit(int[] prices) {
//        int buy = prices[0];
//        int profit = 0;
//        for (int i = 1; i < prices.length; i++) {
//            if (buy > prices[i]) {
//                buy = prices[i];
//            }
//            else if ( prices[i] - buy > profit) {
//                profit = prices[i] - buy;
//            }
//        }
//        return profit;
//    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int currentProfit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}

/* [7, 1, 5, 3, 6, 4]
output: 5
buy on day 2(price = 1) and sell on day 5(price = 6), profit = 6-1 = 5,
Note that buying on day 2 and sell on day 1 is not possible because you must buy before you sell.

   [7, 6, 4, 3, 1]
   output: 0
   In this case, no transactions are done and the max profit = 0.
 */

