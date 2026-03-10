class Solution {
    public int maxProfit(int[] prices) {
    int profit=0,buy=prices[0],n=prices.length,check=0;
    for(int i=1;i<n-1;i++)
    {
        buy=Math.min(buy,prices[i]);
        if(prices[i]>buy)
        {
            check += 1;
        }
        if(prices[i]>prices[i+1])
        {
            profit += prices[i]-buy;
            buy=prices[i];
            check=0;
        }
    }
    if(n>1&&(prices[n-1]>prices[n-2]||check>0))
    {
        profit += prices[n-1]-buy;
    }
    return profit;    
    }
}