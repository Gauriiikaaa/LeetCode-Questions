class Solution {
    public int divide(int dividend, int divisor) {
          if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Clamp to 2147483647
        }
        return dividend/divisor;
    }

}