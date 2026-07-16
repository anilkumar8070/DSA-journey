import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (freq.get(a).equals(freq.get(b))) {
                    return b - a;
                }
                return freq.get(a) - freq.get(b);
            }
        );

        for (int num : nums) {
            pq.offer(num);
        }

        int[] ans = new int[nums.length];
        int i = 0;

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }

        return ans;
    }
}