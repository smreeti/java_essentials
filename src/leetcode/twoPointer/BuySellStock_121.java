package leetcode.twoPointer;

public class BuySellStock_121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int maxProfit = 0;
        int buy = prices[0];

        for (int price : prices) {
            if (price < buy) {
                buy = price;
            }

            int profit = price - buy;
            maxProfit = Math.max(profit, maxProfit);
        }

        System.out.println(maxProfit);
    }
}
