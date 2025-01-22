class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        k = k %n;
        for(int i =0; i<k ;i++)
        {
            arr[i] = nums[n-k+i];
        }
        for(int i = k;i<nums.length;i++)
        {
            arr[i] = nums[i-k];
        }
        for(int i = 0; i<nums.length;i++)
        {
            nums[i] = arr[i];
        }
    }
    
    
}