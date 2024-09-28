class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("\\s","");
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
               i++;
               j--;
             }
             else{
                if(!Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                }
                else if(!Character.isLetterOrDigit(s.charAt(j))){
                    j--;
                }
                else{
                   return false;
                }
             }
             
        }
        return true;
    }
}