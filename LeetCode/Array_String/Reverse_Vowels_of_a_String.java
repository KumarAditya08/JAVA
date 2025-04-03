class Solution {
    
    public static boolean vowel(char c)
    {
        char v[] = {'a','e','i','o','u','A','E','I','O','U'};

        for(char t : v)
        {
            if(t==c) return true;
        }
        return false;
    }
   
    public String reverseVowels(String s) {
        
       StringBuilder sb = new StringBuilder(s);

       int i=0, j = s.length()-1;

       while(i<j)
       {
         if(Solution.vowel(s.charAt(i)) && Solution.vowel(s.charAt(j)))
         {
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,s.charAt(i));
            i++;
            j--;
         }

         else if(Solution.vowel(s.charAt(i)))
         {
            j--;
         }

         else if(Solution.vowel(s.charAt(j)))
         {
            i++;
         }

         else
         {
            i++;
            j--;
         }
       }

       return sb.toString();
    }
}