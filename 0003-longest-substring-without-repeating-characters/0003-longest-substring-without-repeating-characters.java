        class Solution {
            public int lengthOfLongestSubstring(String s) {
                int ans = 0;
                HashMap<Character,Integer> map = new HashMap<>();
                int i = 0;
                for(int j = 0 ; j < s.length() ; j++){
                    char ch = s.charAt(j);
                    if(map.containsKey(ch)){
                        i = Math.max(map.get(ch)+1,i);
                    }
                    map.put(ch,j);
                    ans = Math.max(ans,j-i+1);
                }

                return ans;
            }
        }