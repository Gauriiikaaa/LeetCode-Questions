class Solution {
    public int subarraySum(int[] nums) {
        int tot_sum = 0;
        for(int i =0; i<nums.length;i++)
        {
            int begin = Math.max(0,i-nums[i]);
            for(int j = begin; j<=i; j++)
            {
                tot_sum = tot_sum + nums[j];
            }
       
        }
        return tot_sum;
    }
}