import java.util.*;

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int temp[] = Arrays.copyOf(candies,candies.length);

        Arrays.sort(temp);

        int M = temp[candies.length-1];

        List<Boolean> brr = new ArrayList<>();

        for(int n: candies)
        {
            if(n+extraCandies>=M)
            {
                brr.add(true);
            }
            else
            {
                brr.add(false);
            }
        }

        return brr;
        
    }
}