import java.util.*;

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            map.putIfAbsent(edges[i][0], new ArrayList<>());
            map.get(edges[i][0]).add(edges[i][1]);
            
            map.putIfAbsent(edges[i][1], new ArrayList<>());
            map.get(edges[i][1]).add(edges[i][0]);
        }

        for (int node : map.keySet()) {
            if (map.get(node).size() == edges.length) {
                return node; 
            }
        }

        return -1; 
    }
}
