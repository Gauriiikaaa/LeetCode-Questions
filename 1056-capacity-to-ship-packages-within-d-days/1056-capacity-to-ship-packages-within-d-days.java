class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE, right = 0;
        for(int w : weights)
        {
            left = Math.max(left,w);
            right += w;
        }
        while(left< right)
        {
            int mid = left + (right-left)/2;
            if(isValid(weights,mid)<=days)
            {
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    private int isValid(int[] weight, int target)
    {
        int total = 0;
        int count = 1;
        for(int w : weight)
        {
            total +=w;
            if(total>target)
            {
                count++;
                total = w;
            }
        }
        return count;
    }
}