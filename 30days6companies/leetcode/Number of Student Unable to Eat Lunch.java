class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int square=0,circular=0;

        for(int student : students){
            if(student==1){
                circular++;
            }else{
                square++;
            }
        }
        for(int sandwich : sandwiches)
        {
            if(sandwich==1 && circular>0){
                circular--;
            }else if(sandwich==0 && square>0){
                square--;
            }
            else{
                return circular+square;
            }
        }
        return 0;
    }
}