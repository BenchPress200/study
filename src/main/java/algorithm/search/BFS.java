package algorithm.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public int[] run(List<Integer>[] graph) {
        int n = graph.length; // 정점의 개수
        boolean[] visited = new boolean[n]; // 각 정점의 방문여부

        return dfs(0, graph, visited); // 깊이우선탐색 진행
    }

    private int[] dfs(int start, List<Integer>[] graph, boolean[] visited) {
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            order.add(cur);

            for(Integer next : graph[cur]) {
                if(!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }

        int[] result = new int[order.size()];

        for (int i = 0; i < order.size(); i++) {
            result[i] = order.get(i);
        }

        return result;
    }
}
