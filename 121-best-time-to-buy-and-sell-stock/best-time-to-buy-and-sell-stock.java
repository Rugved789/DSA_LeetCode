class Solution {
    public int maxProfit(int[] prices) {
        int currentprofit=0;
        int max_profit=0;
        int min=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }

            currentprofit=prices[i]-min;
            max_profit=Math.max(max_profit,currentprofit);
        }
        return max_profit;
    }
}