class Solution {
    public void rotate(int[] nums, int k) {
        int rot = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,rot-1);
        reverse(nums,rot,nums.length-1);
    }
    private void reverse(int[] arr,int s , int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}