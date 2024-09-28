class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0, j=0;
        int idx=0;
        int n1=word1.length();
        int n2=word2.length();
         while(i<n1 && j<n2){
                if(idx%2==0){
                    s+=word1.charAt(i++);
                }
                else{
                    s+=word2.charAt(j++);
                }
            idx++;
            }
            while(i<word1.length()){
                    s+=word1.charAt(i);
                    i++;
                }
            while(j<word2.length()){
                    s+=word2.charAt(j);
                    j++;
                }
    
    
        return s;
    }
}