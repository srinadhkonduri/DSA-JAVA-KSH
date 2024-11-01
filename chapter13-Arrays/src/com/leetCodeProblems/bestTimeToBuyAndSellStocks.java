package com.leetCodeProblems;

public class bestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {2,1,3,5,7,8};
        System.out.println(buySellStocks(prices));
    }
//    creating a method to buy and sell stocks
    public static int buySellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
