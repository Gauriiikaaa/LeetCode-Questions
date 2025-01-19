class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //brute force approch 
        //create a hashmap to store both index and values that are present in nums 1 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i< nums1.length;i++)
        {
            hm.put(nums1[i],i);
        }
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i = 0; i<nums2.length ; i++)
        {
            if(!hm.containsKey(nums2[i]))
            {
                continue;
            }
            for(int j = i+1; j<nums2.length;j++)
            {
                if(nums2[j]>nums2[i])
                {
                    int idx = hm.get(nums2[i]);
                    res[idx] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}