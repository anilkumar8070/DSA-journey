class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1)return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:     set){
            pq.add(num);
        }
        int ans = 1;
        int cnt = 1;
        int i = pq.poll();
        while(!pq.isEmpty()){
            int curr = pq.poll();
            if((i+1) == curr){
                cnt++;
            }else{
                cnt = 1;
            }
            i = curr;
            ans = Math.max(ans,cnt);
        }

        return ans;


    }
}