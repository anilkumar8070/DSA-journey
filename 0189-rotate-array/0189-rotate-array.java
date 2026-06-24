class Solution {
    public void rotate(int[] arr, int k) {
        
        int rot = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,rot-1);
        reverse(arr,rot,arr.length-1);

    }

    public void reverse(int[] arr,int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}