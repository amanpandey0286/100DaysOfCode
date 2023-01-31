 public int maxProfit(int[] prices) {
        int profit = 0;
        //initaited for loop from index one.
        for(int i  = 1; i<prices.length; i++){
            //checking if current element is greater then previous element 
            if(prices[i]>prices[i-1]){
                //profit = profit + difference btw two.
                profit += (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
