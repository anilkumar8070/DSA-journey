class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int[] ans = new int[nums.length - k + 1];
        int i = 0, j = 0;
        while (j < nums.length) {
            pq.add(new int[]{nums[j], j});

            if (j - i + 1 == k) {
                while (pq.peek()[1] < i) {
                    pq.poll();
                }

                ans[i] = pq.peek()[0];

                i++;
            }
            j++;
        }

        return ans;
    }
}