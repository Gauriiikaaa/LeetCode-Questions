

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length; 
        
        for (int i = 0; i < n; i++) {
            // Maintain a monotonic stack (increasing order of heights)
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int ele = st.pop(); // Pop the top element (current height)
                int nse = i; // Next Smaller Element index
                int pse = st.isEmpty() ? -1 : st.peek(); // Previous Smaller Element index
                maxArea = Math.max(heights[ele] * (nse - pse - 1), maxArea); // Calculate area
            }
            st.push(i);
        }

        // Process remaining elements in the stack
        while (!st.isEmpty()) {
            int nse = n; // NSE for remaining elements is beyond the array
            int ele = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek(); // Previous Smaller Element index
            maxArea = Math.max(heights[ele] * (nse - pse - 1), maxArea); // Calculate area
        }

        return maxArea;
    }
}
