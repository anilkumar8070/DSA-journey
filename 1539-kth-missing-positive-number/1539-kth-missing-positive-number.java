class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        int ind = 0;
        int ele = 1;
        while(i<arr.length){
            if(ele == arr[i]){
                i++;
                ele++;
            }else{
                lst.add(ind,ele);
                ind++;
                ele++;
            }
        }
        while(ind<=1000){
            lst.add(ind,ele);
            ind++;
            ele++;
        }

        return lst.get(k-1);
    }
}