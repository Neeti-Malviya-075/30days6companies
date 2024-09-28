class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxNum=0;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
                if(maxNum<count){
                    maxNum=count;
                }
            }else if(c==')'){
                count--;
            }
        }
        return maxNum;
    }
}