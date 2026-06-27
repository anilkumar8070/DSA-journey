class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
		List lst = new ArrayList<>();
		for(int i = 0 ; i < arr.length ; i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		
		for(Map.Entry<Integer,Integer> e : map.entrySet()){
		    if(e.getValue() > 1){
		        lst.add(e.getKey());
		    }
		}

        return lst;
    }
}