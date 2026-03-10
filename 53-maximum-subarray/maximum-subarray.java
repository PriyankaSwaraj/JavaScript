class Solution {
    public int maxSubArray(int[] nums) {
    int sum=nums[0],maxsum=nums[0];
    int n=nums.length;
    for(int i=1;i<n;i++)
    {
        int num=nums[i];
    maxsum=Math.max(sum,maxsum);
    sum=Math.max(sum+num,num);
    }
     maxsum=Math.max(sum,maxsum);    
    return maxsum;
    }
}