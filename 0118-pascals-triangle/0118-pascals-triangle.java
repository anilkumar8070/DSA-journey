class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
       
        for(int m = 0 ; m < numRows ; m++){
            List<Integer> lstt = new ArrayList<>();
            lstt.add(1);
            int ans = 1;
            for(int i = 1 ; i <= m ; i++){
                
                ans = ans * (m-i+1);
                ans = ans/i;
                lstt.add(ans);
            }
            lst.add(lstt);
        }
        return lst;
    }
}