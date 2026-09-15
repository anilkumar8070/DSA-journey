class Solution {
    public int minOperations(int[] arr, int x) {
        int tsum = 0;
        for(int el : arr){
            tsum += el;
        }
        int target = tsum - x;
        if(target<0)return -1;
        if(target==0)return arr.length;
        int i = 0;
        int j = 0;
        int maxLen = -1;
        int sum = 0;
        while(j<arr.length){
            sum += arr[j];
            while(sum > target){
                sum-=arr[i];
                i++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen == -1 ? -1 : arr.length - maxLen;
    }
}