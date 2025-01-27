class Solution {
    public int countPartitions(int[] nums) {
        int var = 0;
        int sum =0;
        for(int i =0; i<nums.length-1;i++)
        {
            
            int diff = 0;
            sum +=nums[i];
          // System.out.println(sum);
            for(int j =i+1; j<nums.length;j++)
            {
                
                diff += nums[j];
               // System.out.println(diff);
            }
            int cs = (sum - diff);
            System.out.println(cs);
            if((cs%2)==0)
            {
                var++;
            }
        }
        return var;
    }
}