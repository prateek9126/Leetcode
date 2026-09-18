class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> arr1 = new ArrayList<>();

        int r = 0;

        // Find first element >= x
        while (r < arr.length && arr[r] < x) {
            r++;
        }

        int l = r - 1;

        while (arr1.size() < k && (l >= 0 || r < arr.length)) {

            if (l < 0) {
                arr1.add(arr[r]);
                r++;
            }
            else if (r >= arr.length) {
                arr1.add(arr[l]);
                l--;
            }
            else {
                int a = Math.abs(x - arr[l]);
                int b = Math.abs(x - arr[r]);

                if (a <= b) {
                    arr1.add(arr[l]);
                    l--;
                }
                else {
                    arr1.add(arr[r]);
                    r++;
                }
            }
        }

        Collections.sort(arr1);

        return arr1;
    }
}