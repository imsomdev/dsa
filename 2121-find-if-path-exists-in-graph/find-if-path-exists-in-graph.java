class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            map.putIfAbsent(u, new ArrayList<>());
            map.get(u).add(v);
            map.putIfAbsent(v, new ArrayList<>());
            map.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(source);
        visited.add(source);
        while (!q.isEmpty()) {
            int element = q.poll();
            if (element == destination) {
                return true;
            }
            for (int neighbor : map.getOrDefault(element, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    q.offer(neighbor);
                    visited.add(neighbor); 
                }
            }
        }
        return false;
    }
}
