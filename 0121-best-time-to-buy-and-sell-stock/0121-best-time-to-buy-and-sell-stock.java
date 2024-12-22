class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int max =0;

        for(int i = 0; i< prices.length;i++)
        {
            if(buy<prices[i])
            {
                sell = prices[i]-buy;
                max = Math.max(max,sell);
            }
            else
            buy = prices[i];
        }
        return max;
    }
}