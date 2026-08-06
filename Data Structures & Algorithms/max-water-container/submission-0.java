class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            // Calculate container width and height (limited by the shorter bar)
            int width = right - left;
            int currentHeight = Math.min(heights[left], heights[right]);
            
            // Update the maximum water area
            int currentArea = width * currentHeight;
            maxWater = Math.max(maxWater, currentArea);

            // Move the pointer pointing to the shorter bar inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}