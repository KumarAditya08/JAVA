class Solution {
    public int compress(char[] chars) {
      
      int i = 0;
      int index = 0;

      int len = chars.length;

      while(i < len)
      {
         char current = chars[i];
         int count = 1;

         while(i < len-1 && current==chars[i+1])
         {
            i++;
            count++;
         }
         chars[index++] = current;
         if(count > 1)
         {
            char s[] = Integer.toString(count).toCharArray();
            for(char c : s)
            {
                chars[index++] = c;
            }
         }

         i++;
      }
      
       return index;
    }
}