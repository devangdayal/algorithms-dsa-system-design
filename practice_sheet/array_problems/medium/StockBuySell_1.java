public class StockBuySell_1 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        StockBuySell_1 stockBuySell1 = new StockBuySell_1();
        System.out.println(stockBuySell1.maxProfit(prices));

    }
}
