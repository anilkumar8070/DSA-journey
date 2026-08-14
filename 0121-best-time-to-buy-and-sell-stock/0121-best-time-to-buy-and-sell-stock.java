class Solution {
    public int maxProfit(int[] arr) {
        int minP = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < arr.length ; i++){
            minP = Math.min(minP,arr[i]);
            ans = Math.max(ans,arr[i]-minP);
        }

        return ans;
    }
}