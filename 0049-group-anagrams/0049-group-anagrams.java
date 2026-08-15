class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String k = new String(arr);

            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(str);
        }

        return new ArrayList<>(map.values());
    }
}