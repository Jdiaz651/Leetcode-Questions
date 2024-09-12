class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> previousRow = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
            List<Integer> pascalRow = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    pascalRow.add(1);
                }else{
                    int first = previousRow.get(j);
                    int second = previousRow.get(j-1);
                    pascalRow.add(first + second);
                }
            }
            previousRow = pascalRow;
            result.add(pascalRow);
        }
        return result;
    }
}