class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int max = Maxi(nums,i);
            int min = Mini(nums,i);
            System.out.println(max + " " + min);
            if(max-min<=k){
                ans = Math.min(ans,i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public int Maxi(int[] arr, int i){
        int max = Integer.MIN_VALUE;
        for(int j = 0; j <= i ; j++){
            max = Math.max(max,arr[j]);
        }
        return max;
    }
    public int Mini(int[] arr, int i){
        int min = Integer.MAX_VALUE;
        for(int j = i; j < arr.length ; j++){
            min = Math.min(min,arr[j]);
        }
        return min;
    }
}