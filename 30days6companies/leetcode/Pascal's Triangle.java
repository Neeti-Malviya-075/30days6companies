class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int c_row=1; c_row<numRows; c_row++){
            result.add(new ArrayList<>());

            List<Integer> cRowList=result.get(c_row);
            List<Integer> pRowList=result.get(c_row-1);

            cRowList.add(1);

            for(int i=1; i<pRowList.size(); i++){
                int sum=pRowList.get(i)+pRowList.get(i-1);
                cRowList.add(sum);
            }
            cRowList.add(1);
        }
        return result;
    }
}