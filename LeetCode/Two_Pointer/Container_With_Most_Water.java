class Solution {

    public static int Min(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        else return b;
    }
    
   
    public int maxArea(int[] height) {

      int max_area = 0;

      for(int i=0;i<height.length-1;i++)
      {
        for(int j=i+1;j<height.length;j++)
        {
            int area = (Solution.Min(height[i],height[j]))*(j-i);
            if(area > max_area) max_area = area;
        }
      }

      return max_area;
    }
}