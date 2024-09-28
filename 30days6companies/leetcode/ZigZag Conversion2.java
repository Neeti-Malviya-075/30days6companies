class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s; 
        }
       String[] res=new String[numRows];
       for(int i=0; i<numRows; i++){
         res[i]="";
       }
       int j=0;
       while(j<s.length()){
        for(int i=0; i<numRows && j<s.length(); i++){
            res[i]+=Character.toString(s.charAt(j++));
        }
        for(int i=numRows-2; i>0 && j<s.length(); i--){
            res[i]+=Character.toString(s.charAt(j++));
        }
       }
       String ans="";
        for(String str: res){
            ans+=str;
        }
        return ans;
    }
}