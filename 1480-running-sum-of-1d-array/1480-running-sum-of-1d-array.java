class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        insert(nums,arr,0,0);

        return arr;
    }

    public void insert(int[] nums, int[] arr, int i,int prev){
        if(i==nums.length){
            return;
        }
        arr[i] = prev + nums[i];
        insert(nums,arr,i+1,arr[i]);
    }
}