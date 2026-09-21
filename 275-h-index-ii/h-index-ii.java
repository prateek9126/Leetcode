class Solution {
    public int hIndex(int[] citations) {
        int l = 0;
        int r = citations.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (citations[mid] >= citations.length - mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return citations.length - l;
    }
}