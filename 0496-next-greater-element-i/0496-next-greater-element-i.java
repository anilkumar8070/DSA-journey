class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length ; i++){
            ans[i] = nearestGE(nums1[i],nums2);
        }
        return ans;
    }

    public int nearestGE(int el,int[] arr){
        Stack<Integer> stk = new Stack<>();
        int indx = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]==el){
                indx = i;
            }
        }
        if(indx == arr.length-1)return -1;
        for(int i = arr.length-1 ; i>indx ; i--){
            stk.push(arr[i]);
        }

        while(!stk.isEmpty()){
            if(el<stk.peek()){
                return stk.peek();
            }else{
                stk.pop();
            }
        }

        return -1;

    }
}