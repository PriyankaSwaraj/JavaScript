class Solution {
    public int maxArea(int[] height) {
    int i=0,j=height.length-1,area=0;
    while(i<j)
    {
        int len=Math.min(height[i],height[j]);
        int breadth=j-i;
        area=Math.max(area,len*breadth);
        if(height[i]<height[j])
        {
            i++;
        }
        else{
            j--;
        }
    }
    return area;
    }
}