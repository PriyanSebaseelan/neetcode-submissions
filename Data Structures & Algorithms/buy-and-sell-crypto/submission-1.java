class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int temp_max = 0;
        int left = 0;
        for (int right = 0; right < prices.length; right++) {
            if (prices[left] > prices[right]) {
                left = right;
            }

            temp_max = prices[right] - prices[left];
            
            if (temp_max > max) {
                max = temp_max;
            }
        }

        return max;
    }
}
