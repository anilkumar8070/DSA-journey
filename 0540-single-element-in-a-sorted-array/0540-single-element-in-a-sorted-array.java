class Solution {
    public int singleNonDuplicate(int[] arr) {
         int s = 0;
         int e = arr.length;

         while(s<e){
            int m = s + (e-s)/2;

            if(m%2!=0){
                m--;
            }

            if(m<arr.length-1 && arr[m]==arr[m+1]){
                s=m+2;
            }else{
                e=m;
            }

         }return arr[s];
    }
}