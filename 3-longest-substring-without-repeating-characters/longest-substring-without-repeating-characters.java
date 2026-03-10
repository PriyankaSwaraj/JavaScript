class Solution {
    public int lengthOfLongestSubstring(String s) {
    int len=0,n=s.length();
    for(int i=0;i<n;i++)
    {
        int count=0,j=i;;
        HashSet<Character> set=new HashSet<>();
        while(j<n&&!set.contains(s.charAt(j)))
        {
            set.add(s.charAt(j));
            count++;
            j++;
        }
        len =Math.max(count,len);
    }    
    return len;
    }
}