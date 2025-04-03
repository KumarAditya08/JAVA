class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;

        int r[] = new int[size];

        for(int i=0;i<size-1;i++)
        {
             int temp = 1;
            for(int j=i+1;j<size;j++)
            {
               temp *= nums[j];
            }
            r[i] = temp;
        }
        r[size-1] = 1;

        int l[] = new int[size];

        for(int i=size-1;i>0;i--)
        {
            int temp = 1;
            for(int j=i-1;j>=0;j--)
            {
                temp *= nums[j];
            }
            l[i] = temp;
        }
        l[0] = 1;

        int res[] = new int[size];

        for(int i=0;i<size;i++)
        {
            res[i] = l[i]*r[i];
        }

        return res;
    }
}