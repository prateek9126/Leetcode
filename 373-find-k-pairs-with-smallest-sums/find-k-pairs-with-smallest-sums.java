class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (nums1[a[0]] + nums2[a[1]])
                    - (nums1[b[0]] + nums2[b[1]])
        );

        // Put first pair of each row
        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.add(new int[]{i, 0});
        }

        while (k > 0 && !pq.isEmpty()) {

            int[] curr = pq.poll();

            int i = curr[0];
            int j = curr[1];

            // Add current pair
            ans.add(Arrays.asList(nums1[i], nums2[j]));

            // Add next pair from same row
            if (j + 1 < nums2.length) {
                pq.add(new int[]{i, j + 1});
            }

            k--;
        }

        return ans;
    }
}