class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        int max=0;
        int buyDate = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyDate){
                buyDate=prices[i];
            }
            curr = prices[i]-buyDate;
            max = Math.max(max,curr);
        }
        return max;
    }
}