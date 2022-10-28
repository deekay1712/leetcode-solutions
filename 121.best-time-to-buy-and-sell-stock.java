class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0, min = Integer.MAX_VALUE;

        for(int x: prices){
            if(x < min)
                min = x;

            if(x - min > maxProfit)
                maxProfit = x - min;
        }

        return maxProfit;
    }
}


