class Solution {
    public String mergeAlternately(String word1, String word2) {
        
      StringBuilder sb = new StringBuilder();

     
      int len_1 = word1.length(), len_2 = word2.length();

       for(int i=0,j=0;i<len_1 || j<len_2;i++,j++)
       {
         if(i<len_1) sb.append(word1.charAt(i));
         if(j<len_2) sb.append(word2.charAt(j));
       }

       return sb.toString();
    }
}