class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            int count = 0;
            int j = 0;
            while(j!=nums.length){
                if(nums[i]>nums[j]){
                    count++;
                }
                j++;
            }
            arr[i] = count;
        }

        return arr;
    }
}