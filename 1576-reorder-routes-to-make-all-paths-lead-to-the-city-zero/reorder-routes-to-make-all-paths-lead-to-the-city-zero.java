class Solution {
    void dfs(int node, Map<Integer, List<Integer>> fw, Map<Integer, List<Integer>> bw, boolean[] visited, int[] res) {
        visited[node] = true;
        if (fw.containsKey(node)) {
            for (int neighbor : fw.get(node)) {
                if (!visited[neighbor]) {
                    res[0] += 1; 
                    dfs(neighbor, fw, bw, visited, res);
                }
            }
        }
        if (bw.containsKey(node)) {
            for (int neighbor : bw.get(node)) {
                if (!visited[neighbor]) {
                    dfs(neighbor, fw, bw, visited, res); 
                }
            }
        }
    }
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Integer>> fw = new HashMap<>();
        Map<Integer, List<Integer>> bw = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < connections.length; i++) {
            fw.putIfAbsent(connections[i][0], new ArrayList<>());
            fw.get(connections[i][0]).add(connections[i][1]);

            bw.putIfAbsent(connections[i][1], new ArrayList<>());
            bw.get(connections[i][1]).add(connections[i][0]);
        }

        int[] res = {0};
        dfs(0, fw, bw, visited, res);
        return res[0];
    }
}
