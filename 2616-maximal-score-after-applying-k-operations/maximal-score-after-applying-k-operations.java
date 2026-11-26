class Solution {
    public long maxKelements(int[] nums, int k) {
        // Max-Heap: Collections.reverseOrder() puts the largest number at the top
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            pq.offer(num);
        }
        
        long score = 0;
        while (k > 0) {
            int max = pq.poll();                  // O(log N) to get and remove largest
            score += max;
            pq.offer((int) Math.ceil(max / 3.0)); // O(log N) to insert updated value
            k--;
        }
        
        return score;
    }
}