class Solution {
    private boolean checkVowel(char c){
         return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
     }
    public int maxVowels(String s, int k) {
        int count=0;
        int max_count=0;
       
        for(int i=0; i<k; i++){
            if(checkVowel(s.charAt(i))){
                count++;
            }
        }
        max_count=count;
        for(int i=k; i<s.length(); i++){
            if(checkVowel(s.charAt(i))){
                count++;
            }
            if(checkVowel(s.charAt(i-k))){
                count--;
            }
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}