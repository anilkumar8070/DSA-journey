class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i+1 ; j < nums.length ; j++){
                int k = - (nums[i] + nums[j]);
                if(seen.contains(k)){
                    if((nums[i]+nums[j]+k == 0) ){
                        List<Integer> lstt = new ArrayList<>();
                        lstt.add(nums[i]);
                        lstt.add(nums[j]);
                        lstt.add(k);
                        
                        Collections.sort(lstt);
                        set.add(lstt);
                    }
                
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(set);
    }
}