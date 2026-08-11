class Solution {
    public int findPeakElement(int[] arr) {
        int s = 0 ;
        int e = arr.length-1;
        while(s<e){
            int m = (s+e)/2;
            if(arr[m]<arr[m+1]){
                s = m+1;
            }else if(arr[m]>arr[m+1]){
                e = m;
            }

            if(s==e)return s;
        }  
        return 0; 
    }
}