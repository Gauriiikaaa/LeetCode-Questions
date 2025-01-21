class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n = nums.length;
         k = k%n;
        int j = 0;
        for(int i =0 ;i<k;i++)
        {
            arr[i] = nums[n-k+i];

        }
        for (int i = k; i < n; i++) {
            arr[i] = nums[i - k];
        }
        
        // Copy the result back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
        
    }
}