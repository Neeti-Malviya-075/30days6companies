class Solution {
    public void reverseString(char[] s) {
      
        swap(0,s.length-1,s);
    }
    public void swap(int i, int j, char[]s){
        while(i<j){
        char temp= s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
       }
    }
}