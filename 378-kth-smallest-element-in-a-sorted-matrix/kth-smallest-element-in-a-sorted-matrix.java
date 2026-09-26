class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            return arr.get(k-1);
        }
        return -1;
    }
}