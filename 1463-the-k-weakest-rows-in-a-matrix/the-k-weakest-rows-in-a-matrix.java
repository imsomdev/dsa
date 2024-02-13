class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] countOne = new int[rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 1){
                    countOne[i]++;
                } else {
                    break;
                }
            }
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            } else {
                return b[1] - a[1];
            }
        });
        for(int i = 0; i < rows; i++){
            maxHeap.offer(new int[]{countOne[i], i});
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = k - 1; i >= 0; i--){
            res[i] = maxHeap.poll()[1];
        }
        
        return res;
    }
}
