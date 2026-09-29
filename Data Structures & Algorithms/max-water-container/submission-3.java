class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int temp_max = 0;
        int small = 0;
        int low = 0;
        int high = heights.length - 1;
        while (low < high) {
            if (heights[low] < heights[high]) {
                small = heights[low];
            } else {
                small = heights[high];
            }

            temp_max = (high - low) * small;

            if (temp_max > max) {
                max = temp_max;
            }

            if (small == heights[low]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
