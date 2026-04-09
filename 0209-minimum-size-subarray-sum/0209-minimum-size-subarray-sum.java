class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        
        for(int right = 0 ; right<arr.length ; right++){
            sum = sum + arr[right];
            while(sum>=target){
                ans = Math.min(ans,(right-left+1));
                sum = sum - arr[left];
                left++;
            }
            
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}