class Solution {
    public String makeGood(String s) {
        Stack <Character> a=new Stack<>();
        for(char c: s.toCharArray()){
            if(!a.isEmpty() && Math.abs(c-a.peek())==32){
                a.pop();
            }else{
                a.push(c);
            }
        }
        StringBuilder str= new StringBuilder();
        while(!a.isEmpty()){
            str.insert(0,a.pop());
        }
        return str.toString();
    }
}