class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
		int ans = 0;
		int i = 0;
		
		for(int j = 0; j < str.length() ; j++){
		    char ch = str.charAt(j);
		    if(map.containsKey(ch) && map.get(ch)>=i){
		        i = map.get(ch) + 1;
		    }
		    
		    map.put(ch,j);
		    ans = Math.max(ans,j-i+1);
		}
		
       return ans;
    }
}