class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] wrd = s.trim().split("\\s+");
        for(int i = wrd.length-1; i>=0;i--){
            ans = ans + wrd[i];
            if(i!=0){
                ans += " ";
            }
        }
        return ans;
    }
}