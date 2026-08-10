    class Solution {
        public int maxArea(int[] arr) {
            int i = 0;
            int j = arr.length-1;
            int area = 0;
            while(i<j){
                int h = Math.min(arr[i],arr[j]);
                int base = j-i;
                area = Math.max(area,h*base);
                if(arr[i]<arr[j]){
                    i++;
                }else{
                    j--;
                }
            }
            return area;
        }
    }