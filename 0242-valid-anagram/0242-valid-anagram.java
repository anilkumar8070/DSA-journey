class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            char cht = t.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
            map.put(cht,map.getOrDefault(cht,0)-1);
            
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()!=0){
                return false;
            }
        }

        return true;

    }
}