class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int s = 0;
        int pos = nums.length - 1; 
        int e = nums.length-1;
        while(s<=e){
            int ls = nums[s]*nums[s];
            int rs = nums[e]*nums[e];

            if(ls>rs){
                arr[pos--] = ls;
                s++;
            }else{
                arr[pos--] = rs;
                e--;
            }
        }

        return arr;
    }
}