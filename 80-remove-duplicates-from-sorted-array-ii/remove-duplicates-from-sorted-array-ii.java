class Solution {
    public int removeDuplicates(int[] nums) {
    int k=2,n=nums.length,count=0;
     for(int i=2;i<n;i++)
     {
        if(nums[i]!=nums[k-2])
        {
            nums[k]=nums[i];
            k++;
        }
        else{
            count++;
        }
     }    
     return n-count;
    }
}